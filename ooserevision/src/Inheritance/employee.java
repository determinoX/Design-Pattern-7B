/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author FA20-BSE-042
 */
public class employee {
    float salary = 45000;
}
class designer extends employee{
float bonus = 30000;

public static void main (String[] args){

designer d=new designer();

System.out.println("salary and bonus:" + d.bonus );

}
}