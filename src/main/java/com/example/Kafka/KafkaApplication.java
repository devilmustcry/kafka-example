package com.example.Kafka;

import com.example.Kafka.consumers.KafkaConsumer;
import com.example.Kafka.models.Apologize;
import com.example.Kafka.models.Greeting;
import com.example.Kafka.producers.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) throws Exception {
	    SpringApplication.run(KafkaApplication.class, args);

//		KafkaProducer producer = context.getBean(KafkaProducer.class);
//		KafkaConsumer listener = context.getBean(KafkaConsumer.class);
//		producer.sendMessage("Hello, world");

//		producer.sendMessage("Hello, world");
//		listener.getLatch().await(10, TimeUnit.SECONDS);
//		producer.sendConsumable(new Greeting("Greeting", "Traveller"));
//		producer.sendConsumable(new Apologize("My Apologies..."));
	}
//
//	@Bean
//	public KafkaConsumer messageProducer() {
//		return new KafkaConsumer();
//	}
//
//	@Bean
//	public KafkaProducer messageListener() {
//		return new KafkaProducer();
//	}

//	public static class MessageProducer {
//
//		@Autowired
//		private KafkaTemplate<String, String> kafkaTemplate;
//
//		@Value(value = "${message.topic.name}")
//		private String topicName;
//
//		public void sendMessage(String message) {
//			kafkaTemplate.send(topicName, message);
//		}
//
//	}
//	public static class MessageListener {
//
//		private CountDownLatch latch = new CountDownLatch(3);
//
//		@KafkaListener(topics = "${message.topic.name}", groupId = "foo", containerFactory = "kafkaListenerContainerFactory")
//		public void listenGroupFoo(String message) {
//			System.out.println("Received Messasge in group 'foo': " + message);
//			latch.countDown();
//		}
//	}
}
