package com.beike.tysd;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/**
 * @author: yefeirong
 * @date: 2022/3/6 23:34
 * @describe:
 */
public class KConsumer{
    public static void main(String[] args) {
        //0配置
        Properties properties = new Properties();
        //连接
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"10.112.3.5:9092,10.112.3.6:9092");
        //反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        //配置消费者组id
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"test");
        //1.创建一个消费者  “”，“hello”
        KafkaConsumer<String,String> kafkaConsumer = new KafkaConsumer<>(properties);
        //2 定义主题
        ArrayList<String> topics = new ArrayList<>();
        topics.add("applog");
        kafkaConsumer.subscribe(topics);
        //3.消费数据
        while (true){
            ConsumerRecords<String,String> consumerRecords =  kafkaConsumer.poll(1);
            for (ConsumerRecord<String,String> cc:consumerRecords) {
                System.out.println(cc);

            }

        }



    }

}
