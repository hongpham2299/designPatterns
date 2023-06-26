package builderPattern;

import builderPattern.builder.UserWebDTOBuilder;
import builderPattern.model.User;
import builderPattern.builder.UserDTO;
import builderPattern.builder.UserDTOBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Main.class.getName());

        Director director = new Director();

        User user = Director.createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        //Provide director with concrete builder
        UserDTO userDTO = director.directBuild(builder, user);
        logger.info(userDTO);
    }
}
