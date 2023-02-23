package pl.lpyzocha.rewardprogram.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardPointsController {


    @GetMapping(path = "/points/{customerId}")
    public String testEndpoint(@PathVariable Long customerId){

        return "OK : " + customerId;
    }
}
