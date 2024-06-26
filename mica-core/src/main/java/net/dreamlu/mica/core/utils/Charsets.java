/*
 * Copyright (c) 2019-2029, Dreamlu 卢春梦 (596392912@qq.com & www.dreamlu.net).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu.mica.core.utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 字符集工具类
 *
 * @author L.cm
 */
public interface Charsets {

	/**
	 * 字符集ISO-8859-1
	 */
	Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
	String ISO_8859_1_NAME = ISO_8859_1.name();

	/**
	 * 字符集GBK
	 */
	Charset GBK = Charset.forName(StringPool.GBK);
	String GBK_NAME = GBK.name();

	/**
	 * 字符集utf-8
 	 */
	Charset UTF_8 = StandardCharsets.UTF_8;
	String UTF_8_NAME = UTF_8.name();
}
