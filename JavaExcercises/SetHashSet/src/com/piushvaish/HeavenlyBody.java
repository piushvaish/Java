package com.piushvaish;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by piush on 09/09/2016.
 */
public abstract class HeavenlyBody {
    //private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    //private final BodyTypes bodyType;
    private final Key key;

    //enum
    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        //this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        //this.bodyType = bodyType;
        this.key = new Key(name,bodyType);
    }

//    public String getName() {
//        return name;
//    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    //    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj){
        if(this == obj){
           return true;
        }
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if((obj == null) || (obj.getClass() != this.getClass())){
//            return false;
//        }
        if(obj instanceof HeavenlyBody) {


            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
//            if(this.name.equals(theObject.getName())){
//                return this.bodyType == theObject.getBodyType();
//
//            }
//        }
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
        return false;
    }

//not a good practise
//    @Override
//    public int hashCode() {
//        return this.name.hashCode();
//    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
        //System.out.println("hashcode called");
        //return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }
    public static Key makeKey(String name,BodyTypes bodyType){
        return new Key(name,bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return(this.bodyType == key.getBodyTypes());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ":" + this.bodyType;
        }
    }


}

