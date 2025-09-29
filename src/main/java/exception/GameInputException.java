package exception;

import message.GameMessage;

public class GameInputException {

    //private static GameInputException defaultGameInputException;

    public GameInputException() {
    }



    public void validateNameLength(String[] names) {
        for(String name : names) {
            if(name.length() > 5) {
                throw new IllegalArgumentException(GameMessage.nameError.getMessage());
            }
        }
    }

    public void validateNumber(String number) {
        if(!number.matches(GameMessage.REGEX.getMessage())) {
            throw new IllegalArgumentException(GameMessage.countError.getMessage());
        }
    }

    public void validateNumberZero(String number) {
        if(number.length() > 1 && number.charAt(0) == '0') {
            throw new IllegalArgumentException(GameMessage.countError.getMessage());
        }
    }

    public void close() {
        //defaultGameInputException = null;
    }

}
