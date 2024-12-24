package com.consumer.config;

import com.consumer.config.constant.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstant.LOCATION_TOPIC,groupId =AppConstant.GROUP_ID )
    public void updateLocation(String location){
        System.out.println(location);
    }

}
