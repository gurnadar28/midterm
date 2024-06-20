/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/**
 * This class takes String input from user and calls method statusDetail to
 * print the status of User-Rejected,Pending,Processing and Approved. if the
 * input is not given in String, program will accept and produce wrong results.
 * change the code to use enums which avoids String input then print the status
 * details.
 *
 * @author srinivsi
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0 for REJECTED, 1 for PENDING, 2 for PROCESSING, 3 for APPROVED)");
        int code = in.nextInt(); 
        StatusUser statusUser = new StatusUser();

        
        switch (code) {
            case 0:
                statusUser.printUserStatus(UserStatus.REJECTED);
                break;
            case 1:
                statusUser.printUserStatus(UserStatus.PENDING);
                break;
            case 2:
                statusUser.printUserStatus(UserStatus.PROCESSING);
                break;
            case 3:
                statusUser.printUserStatus(UserStatus.APPROVED);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

}
