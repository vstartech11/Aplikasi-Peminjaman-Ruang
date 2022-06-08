/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class LoginLogic {
    private String nim ;
    private String password ;
    public LoginLogic(String nim,String password){
        this.nim = nim;
        this.password= password;
    
    }
    public static void main(String[] args) {
        LoginLogic login = new LoginLogic(LoginForm.get_nim_field(),LoginForm.get_pass_field());
    }
}
