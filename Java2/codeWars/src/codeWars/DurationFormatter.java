package codeWars;

import java.util.ArrayList;
import java.util.List;

public class DurationFormatter {
    public static String formatDuration(int seconds) {
        List<String> módulos = new ArrayList<>();
        StringBuilder tiempoFormateado = new StringBuilder();
        
        if (seconds == 0) {
        	return "now";
        }
        
        int years = seconds / (365 * 24 * 3600);
        seconds %= 365 * 24 * 3600;
        int days = seconds / (24 * 3600);
        seconds %= 24 * 3600;
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        
        if (years > 0) {
            if (years > 1) {
                módulos.add(years +  " years");
            } else {
                módulos.add(years + " year");
            }
        }
        if (days > 0) {
            if (days > 1) {
                módulos.add(days +  " days");
            } else {
                módulos.add(days + " day");
            }
        }
        if (hours > 0) {
            if (hours > 1) {
                módulos.add(hours +  " hours");
            } else { 
                módulos.add(hours + " hour");
            }
        }
        if (minutes > 0) {
            if (minutes > 1) {   
                módulos.add(minutes +  " minutes");
            } else {
                módulos.add(minutes + " minute");
            }
        }
        if (seconds > 0) {	
            if (seconds > 1) {
                módulos.add(seconds +  " seconds");
            } else {
                módulos.add(seconds + " second");
            }
        }
        		
	        for (int i = 0; i < módulos.size(); i++) {
	            if (i > 0) {
	                if (i == módulos.size() - 1) {
	                    tiempoFormateado.append(" and "); 
	                } else {
	                    tiempoFormateado.append(", ");
	                }
	            }
	            tiempoFormateado.append(módulos.get(i));
	        }
        
        return tiempoFormateado.toString();
    }
}
