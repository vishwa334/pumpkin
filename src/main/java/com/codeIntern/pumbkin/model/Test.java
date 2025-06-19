package com.codeIntern.pumbkin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Test {

    @Id
    private String id;
    private String name;
}
