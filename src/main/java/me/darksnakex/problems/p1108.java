package me.darksnakex.problems;

public class p1108 {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
