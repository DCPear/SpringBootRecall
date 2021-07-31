package com.dcpear.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Greeting {
   private long id;
   private String content;
}
