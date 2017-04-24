/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingclient;

import com.mycompany.bankingclient.models.BankAccount;
import com.mycompany.bankingclient.models.Customer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author user
 */
public class RESTConnection {
    public static Customer signIn(String email, String passcode){
        String path = "http://localhost:8080/BankingSystem/api/customer/login";
        Client client = Client.create();
        WebResource target = client.resource(path);
        ClientResponse response = target.queryParam("email", email)
                .queryParam("passcode", passcode)
                .accept("application/json")
                .get(ClientResponse.class);
        String entity = response.getEntity(String.class);
        if(response.getStatus() == 200){
            JSONObject json = new JSONObject(entity);
            Customer c = new Customer(
            json.getInt("cusId"), json.getString("fullName"), 
            json.getString("address"), json.getString("email"), 
            json.getInt("mobile"), json.getString("securityAnswer"),
            json.getString("securityQuestion"), json.getString("passcode"));
            
            return c;
        }else{
            return null;
        }
    }
    
    public static List<BankAccount> customerAccounts(Customer customer){
        String path = "http://localhost:8080/BankingSystem/api/bankAccount/customerAccounts";
        Client client = Client.create();
        WebResource target = client.resource(path);
        List<BankAccount> list = new ArrayList<>();
        ClientResponse response = target.queryParam("cusId", customer.getCusId()+"")
                .accept("application/json")
                .get(ClientResponse.class);
        String entity = response.getEntity(String.class);
        System.out.println(entity);
        if(response.getStatus() == 200){
            JSONArray array = new JSONArray(entity);
            for(int i= 0; i<array.length();i++){
                JSONObject json = array.getJSONObject(i);
                BankAccount account = new BankAccount();
                account.setAId(json.getInt("AId"));
                account.setCusId(customer);
                account.setAccountType(json.getString("accountType"));
                account.setBalance(json.getBigDecimal("balance"));
                account.setSortCode(json.getInt("sortCode"));
                list.add(account);
            }
            
        }
        return list;
    }
    
    public static boolean sendPostRequest(Object object, String apiPath){
        Client client = Client.create();
        WebResource target = client.resource(apiPath);
        
        String param = new JSONObject(object).toString();
        System.out.println("Post param: " + param);
        
        ClientResponse response = target.accept("application/json")
                .type("application/json")
                .post(ClientResponse.class, param);
        if(response.getStatus() == 204){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean sendPutRequest(Object object, String apiPath, Integer id){
        Client client = Client.create();
        WebResource target = client.resource(apiPath + "/" + id);
        
        String param = new JSONObject(object).toString();
        ClientResponse response = target.accept("application/json")
                .type("application/json")
                .put(ClientResponse.class, param);
        if(response.getStatus() == 204){
            return true;
        }else{
            return false;
        }
    }
}
