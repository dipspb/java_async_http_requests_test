package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobBidResponse {

    @JsonProperty("result")
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JobBidResponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
