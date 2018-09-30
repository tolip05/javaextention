package importance;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private Importance treschort;
    private List<Message>messages;

    public Logger(Importance treschort) {
        this.treschort = treschort;
        this.messages = new ArrayList<>();
    }
    public void record(Message message){
        if (message.getLevel().compareTo(this.treschort) >= 0){
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return this.messages;
    }
}
