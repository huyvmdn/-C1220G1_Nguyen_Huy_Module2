package FuramaResort.commons;

import java.util.Arrays;

public interface Regex {
    public static final String SERVICE_VILLA = "^SVVL-[0-9]{4}$";
    public static final String SERVICE_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String SERVICE_ROOM = "^SVRO-[0-9]{4}$";
    public static final String SERVICE_NAME = "^[A-Z][a-zA-z\\s]+";
    public static final String OTHERFACIKITIES = "(massage|karaoke|food|drink|car)";
    public static final String GENDER = "(Male|Female)";
    public static final String NAME = "[a-zA-Z\\s]+";
    public static final String BIRTHDAY="([0][1-9]|[12][0-9]|[3][01])[/]([0][1-9]|[1][012])[/]([1][0-9]{3}|[2][0-9]{3})";
    public static final String ID_CARD="[0-9]{9}";
    public static final String PHONE_NUMBER="[0][0-9]{9}";
    public static final String EMAIL_REGEX = "^\\w+((_|\\.)?\\w+)*@\\w+(\\.\\w+){1,3}$";

    public static String nameStandard(String name) {
        name= name.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] arrayName = name.split("");
        arrayName[0]=arrayName[0].toUpperCase();
        StringBuilder newName = new StringBuilder(arrayName[0]);
        for (int i = 1; i < arrayName.length; i++) {
            if (!arrayName[i].equals(" ") && arrayName[i - 1].equals(" ")) {
                arrayName[i] = arrayName[i].toUpperCase();
            }
            newName.append(arrayName[i]);
        }

        System.out.println(newName);
        return newName.toString();
    }
}
