package cp.service;

import cp.dto.ClienteDto;
import cp.dto.ClienteRecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiExternal {

    @Autowired
    RestTemplate restexternal;

    public ClienteRecordDto metodoExterno1(){
        ClienteRecordDto response = restexternal
                .getForObject("https://jsonplaceholder.typicode.com/posts/1", ClienteRecordDto.class);
        return response;
    }

}
