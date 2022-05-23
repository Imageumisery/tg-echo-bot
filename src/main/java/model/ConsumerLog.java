package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class ConsumerLog {
    @JsonProperty("id")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final int id;

    @JsonProperty("msg")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final String msg;

    @JsonProperty("topic")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final String topic;

    @JsonProperty("logDate")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final LocalDate logDate;

    @Override
    public String toString() {
        return "ConsumerLog{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", logDate='" + logDate + '\'' +
                '}';
    }
}
