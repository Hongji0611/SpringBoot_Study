package hello.hellospring.controller;

import hello.hellospring.CalulationResult;
import hello.hellospring.OperandRequest;
import hello.hellospring.service.CalculateServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculateController {
    CalculateServiece calculateServiece = new CalculateServiece();

    @PostMapping("/v1/calculate/add")
    public CalulationResult getAdd(@RequestBody OperandRequest input){
        return calculateServiece.add(input);
    }

    @PostMapping("/v1/calculate/sub")
    public CalulationResult getSub(@RequestBody OperandRequest input){
        return calculateServiece.sub(input);
    }

    @PostMapping("/v1/calculate/mul")
    public CalulationResult getMul(@RequestBody OperandRequest input){
        return calculateServiece.mul(input);
    }

    @PostMapping("/v1/calculate/div")
    public CalulationResult getDiv(@RequestBody OperandRequest input){
        return calculateServiece.division(input);
    }
}
