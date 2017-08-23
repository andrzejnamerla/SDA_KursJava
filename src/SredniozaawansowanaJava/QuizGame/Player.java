package SredniozaawansowanaJava.QuizGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nick;
    private int result;
    private List<Boolean> answers = new ArrayList<>();

    public Player() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<Boolean> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Nick = " + nick + ", result = " + result + ", answers = " + answers;
    }
}
