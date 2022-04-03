package com.example.demo.Controll;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.Parsing.*;


@RestController
public class POST_Coltroller {

    @RequestMapping(value = "/ok", method = RequestMethod.POST)
    public ResponseEntity<Resp> postStst(@RequestBody Req Req){
        Resp Resp = new Resp();
        Resp.setValue(Req.getMss().getName());
        Stat stat = new Stat();
        stat.setCode("Работает!!");
        Resp.setStatObject(stat);

        return new ResponseEntity<>(Resp, HttpStatus.OK);
    }

}
