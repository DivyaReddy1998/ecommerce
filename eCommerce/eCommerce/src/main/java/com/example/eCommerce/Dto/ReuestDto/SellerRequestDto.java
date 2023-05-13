package com.example.eCommerce.Dto.ReuestDto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class SellerRequestDto {

    String name;
    int age;
    String emailId;
    String mobNo;
}
