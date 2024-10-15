package ie.atu.week5lab3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @PostMapping("/person/createPerson")
    public String createPerson(@RequestBody @Valid Person userRequest){
        return "Details added";
    }
}
