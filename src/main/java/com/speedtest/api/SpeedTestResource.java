package com.speedtest.api;

import com.google.gson.Gson;
import com.speedtest.api.model.SpeedTestResult;
import com.speedtest.api.model.User;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/speedtest")
public class SpeedTestResource {
    private final PubSubTemplate pubSub;

    public SpeedTestResource(PubSubTemplate pubSub) {
        this.pubSub = pubSub;
    }

    @PostMapping(path = "/createuser",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody User user) {
        return user.getName();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SpeedTestResult postSpeedResults(@RequestBody SpeedTestResult speedTestResult) {
        this.pubSub.publish("speedtest", new Gson().toJson(speedTestResult));
        return speedTestResult;
    }
}
