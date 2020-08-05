package com.example.restfulwebservice;

// lombok
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 생성자 메서드를 대신함
@NoArgsConstructor  // 디폴트 생성자
public class HelloWorldBean {
    private String message;

//    public String getMessage() {
//        return this.message;
//    }
//    public void setMessage(String msg) {
//        this.message = msg;
//    }

//      생성자 메서드
//    public HelloWorldBean(String message) { this.message = message; }
}
