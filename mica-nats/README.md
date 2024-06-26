## mica-nats（高性能、轻量级消息队列）

nats 封装，更改方便 Spring boot 下使用。

## nats Streaming 概念

在 NATS Streaming 中，`subject`、`queue` 和 `stream` 是三个相关但具有不同概念和用途的术语。

- **Subject（主题）**：`subject` 是指发布者将消息发送到的特定主题名称，也可以认为是消息的目标地址。订阅者可以通过订阅与特定主题相关联的消息来接收该主题下的消息。

- **Queue（队列）**：`queue` 是用于在多个订阅者之间进行负载均衡和竞争消费的机制。当多个订阅者订阅相同的主题时，消息将被发送到队列中，然后只有一个订阅者（随机选择）能够接收和处理该条消息。这种方式确保了消息被平均地分配给订阅者，避免重复处理。

- **Stream（消息流）**：`stream` 是NATS Streaming中用于组织和存储消息的逻辑实体。它是由一个字符串标识符（也称为stream name）表示的，并用于发布和订阅相关的消息。一个消息流可以包含多个主题，而每个主题下可以有不同的订阅者。

总结来说，`subject` 是发布和订阅消息的目标名称，`queue` 是用于负载均衡和竞争消费的机制，而 `stream` 是用于组织和存储消息的逻辑实体。它们在NATS Streaming中各自扮演不同的角色和功能。

## 相关链接
- [NATS—协议详解（nats-protocol）](https://www.cnblogs.com/yorkyang/p/8393080.html)