package pl.doliszny.newspointsimplewebapp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {

    @NonNull
    private String first_name;

    @NonNull
    private String last_name;

    @NonNull
    private String birth_date;


    private String phone_no;
}
