package com.cloud2.consul.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuHeYong
 * @create: 2019-06-12
 * @description:
 **/
@RestController
public class DcController {

    public static final Logger logger = LoggerFactory.getLogger(DcController.class);

    /*@Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(Constants.CLOUD2 + "/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("z_cloud2_consul");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + Constants.CLOUD2 + "/dc";
        logger.info(url);
        return restTemplate.getForObject(url, String.class);
    }*/

}
