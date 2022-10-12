package week4.com.line.parser;

import week4.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]);
    }
}
