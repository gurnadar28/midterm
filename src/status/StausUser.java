/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 *
 * @author srinivsi
 */
enum UserStatus {
    REJECTED,
    PENDING,
    PROCESSING,
    APPROVED
}

class StatusUser {

    
    void printUserStatus(UserStatus status) {
        switch (status) {
            case REJECTED:
                System.out.println("User Status: Rejected");
                break;
            case PENDING:
                System.out.println("User Status: Pending");
                break;
            case PROCESSING:
                System.out.println("User Status: Processing");
                break;
            case APPROVED:
                System.out.println("User Status: Approved");
                break;
            default:
                System.out.println("Invalid status code.");
        }
    }

}
