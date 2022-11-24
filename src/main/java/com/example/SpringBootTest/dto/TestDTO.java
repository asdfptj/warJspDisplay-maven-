package com.example.SpringBootTest.dto;
// https://payjay.tistory.com/23
public class TestDTO {
    private int idx;
    private String NAME;

    public TestDTO() {

    }

    public TestDTO(int idx, String NAME) {
        super();
        idx = idx;
        NAME = NAME;
    }

    public int getIDX() {
        return idx;
    }


}
