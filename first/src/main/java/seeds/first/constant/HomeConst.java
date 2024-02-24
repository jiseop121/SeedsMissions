package seeds.first.constant;

import org.springframework.web.bind.annotation.GetMapping;

public enum HomeConst {
    WELCOME_SENTENCE("Hello world");

    private String message;
    HomeConst(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
