package webservice;

import javax.validation.constraints.Size;

public class FormInput {
    @Size(min = 2, max = 40)
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
