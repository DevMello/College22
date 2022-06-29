package com.devmello.personal.flightTracker;

import javax.swing.*;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;
import org.python.util.jython;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //create a text box for the user to enter the flight number using java swing
        JTextField flightNumber = new JTextField(10);
        //using aviation api to get the flight information
        JLabel flightInfo = new JLabel();
        //create a button to get the flight information
        JButton getFlightInfo = new JButton("Get Flight Info");
        //use the avaitionstack api to get the information
        getFlightInfo.addActionListener(e -> {
            String flightNumberText = flightNumber.getText();
            String flightInfoText = null;
            try {
                flightInfoText = getFlightInfo(flightNumberText);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flightInfo.setText(flightInfoText);
        });


    }

    public static String getFlightInfo(String flightNumber) throws IOException {
        PythonInterpreter pi = new PythonInterpreter();
        pi.exec("from pymodule import square");
        pi.set("integer", new PyInteger(42));
        pi.exec("result = square(integer)");
        pi.exec("print(result)");
        PyInteger result = (PyInteger)pi.get("result");
        System.out.println("result: "+ result.asInt());
        PyFunction pf = (PyFunction)pi.get("square");
        System.out.println(pf.__call__(new PyInteger(5)));

        pi.exec("import requests");
        pi.exec("params = {\n" +
                "  'access_key': 'YOUR_ACCESS_KEY'\n" +
                "}");
        pi.exec("api_result = requests.get('https://api.aviationstack.com/v1/flights', params)");
        pi.exec("api_response = api_result.json()");
        pi.exec("for flight in api_response['results']:\n" +
                "    if (flight['live']['is_ground'] is False):\n" +
                "        print(u'%s flight %s from %s (%s) to %s (%s) is in the air.' % (\n" +
                "            flight['airline']['name'],\n" +
                "            flight['flight']['iata'],\n" +
                "            flight['departure']['airport'],\n" +
                "            flight['departure']['iata'],\n" +
                "            flight['arrival']['airport'],\n" +
                "            flight['arrival']['iata']))");
        return "";
    }
}
