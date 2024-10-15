package ie.atu.week5lab3;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @PositiveOrZero (message = "Age must be greater than or equal to zero")
    private int age;

    @NotBlank (message = "Position cannot be blank")
    private String position;

    @PositiveOrZero (message = "Id must be greater than or equal to zero")
    private String employeeID;
}
