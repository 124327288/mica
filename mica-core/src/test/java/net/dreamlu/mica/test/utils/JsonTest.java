package net.dreamlu.mica.test.utils;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import net.dreamlu.mica.core.utils.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * json 测试
 *
 * @author L.cm
 */
class JsonTest {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static class Views {
		public static class Public { }
		public static class Internal extends Public { }
	}

	@Data
	public static class User {
		@JsonView(Views.Public.class)
		private Long id;

		@JsonView(Views.Public.class)
		private String name;

		@JsonView(Views.Internal.class)
		private String email;
	}

	@Test
	void test1() throws JsonProcessingException {
		User user = new User();
		user.setId(System.currentTimeMillis());
		user.setName("张三");
		user.setEmail("zhangsan@dreamlu.net");
		String json1 = objectMapper.writeValueAsString(user);
		Assertions.assertTrue(json1.contains("zhangsan"));
		String json2 = objectMapper.writerWithView(Views.Public.class).writeValueAsString(user);
		Assertions.assertFalse(json2.contains("zhangsan"));
	}

	@Test
	void test2() throws JsonProcessingException {
		User user = new User();
		user.setId(System.currentTimeMillis());
		user.setName("张三");
		user.setEmail("zhangsan@dreamlu.net");
		String json1 = JsonUtil.toJson(user);
		Assertions.assertTrue(json1.contains("zhangsan"));
		String json2 = JsonUtil.toJsonWithView(user, Views.Public.class);
		Assertions.assertFalse(json2.contains("zhangsan"));
	}

}
