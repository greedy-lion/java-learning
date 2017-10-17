package week3.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import week3.models.randomModel;
import week3.services.randomService;

@RestController
@EnableAutoConfiguration
public class randomController {
    @RequestMapping(value = "/randomArray", method = RequestMethod.GET)
    @ResponseBody
    public randomModel randomArray(@RequestParam(value = "length", required = false, defaultValue = "1000") int length) {
        long startTime = System.nanoTime();
        int[] array = randomService.generateRandomArray();
        long endTime = System.nanoTime();

        randomModel returnResult = new randomModel(startTime, endTime, array);

        return returnResult;
    }
}
