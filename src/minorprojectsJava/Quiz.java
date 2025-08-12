package minorprojectsJava;

import java.util.Scanner;

class Application {
    Scanner in = new Scanner(System.in);
    String Name;
    int audiencePoll = 1, fiftyfifty = 1;
    int age;
    long amount;

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    String Questions[] = {
        "1. Which data type is used to store true/false values?",
        "2. Who invented Java?",
        "3. Which company currently owns Java?",
        "4. What does JVM stand for?",
        "5. Which keyword is used to create an object in Java?",
        "6. Which loop is guaranteed to execute at least once?",
        "7. In which year was Java invented?",
        "8. Which keyword is used to declare a class in Java?",
        "9. What is the default value of an int variable in Java?",
        "10. How many Team Members combined to create Java?"
    };

    String Options[][] = {
        {"1. boolean", "2. int", "3. double", "4. float"},
        {"1. James Gosling", "2. Dennis Ritchie", "3. Bjarne Stroustrup", "4. Ken Thompson"},
        {"1. Oracle", "2. IBM", "3. Amazon", "4. Cisco"},
        {"1. Java Very Machine", "2. Java Vary Machine", "3. Java Virtual Machine", "4. Java Visual Machine"},
        {"1. new", "2. obj", "3. class", "4. function"},
        {"1. for", "2. while", "3. for-each", "4. do-while"},
        {"1. 1975", "2. 1965", "3. 1995", "4. 1992"},
        {"1. method", "2. class", "3. object", "4. return"},
        {"1. 1", "2. 0", "3. null", "4. true"},
        {"1. 11", "2. 10", "3. 12", "4. 15"}
    };

    int correctOptions[] = {1, 1, 1, 3, 1, 4, 3, 2, 2, 1};
    int cashPrize[] = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};

    void userData() {
        System.out.print("Enter User Name: ");
        Name = in.next();
        System.out.print("Enter the Age: ");
        age = in.nextInt();
        System.out.println();
    }

    void quizRules() {
        System.out.println("The Quiz Rules are:");
        System.out.println("\t1. You will have 10 Questions");
        System.out.println("\t2. Each Question will have 4 Options");
        System.out.println("\t3. You will have 2 Lifelines (Audience Poll & 50-50)");
        System.out.println("\t4. You can use each lifeline only once");
        System.out.println("\t5. You can choose to Quit the quiz anytime");
        System.out.println("\t6. If you answer wrong before Question 5, you win ₹0");
        System.out.println("\t7. If you answer wrong between Q5-Q7, you win up to Q5 prize (₹50000)");
        System.out.println("\t8. If you quit, you keep your current prize money");
        System.out.println();
    }

    void confirmDetails() {
        System.out.println("========================================================");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.print("Are the details correct? (yes/no): ");
        String choice = in.next();
        System.out.println("========================================================");

        if (choice.equalsIgnoreCase("no")) {
            userData();
        } else if (!choice.equalsIgnoreCase("yes")) {
            System.out.println(RED + "Invalid input. Proceeding with details as is." + RESET);
        }
    }

    void cashPrize() {
        System.out.println("-----Cash Prize Structure-----");
        for (int i = 0; i < cashPrize.length; i++) {
            System.out.println("Q" + (i + 1) + ": ₹" + cashPrize[i]);
        }
        System.out.println();
    }

    void confirmToStart() {
        System.out.print(Name + ", are you ready to start the quiz? (yes/no): ");
        String choice = in.next();
        if (!choice.equalsIgnoreCase("yes")) {
            playAgain();
        } else {
            System.out.println("Let's start the quiz!");
        }
    }

    void useLifeLine() {
        if (audiencePoll == 0 && fiftyfifty == 0) {
            System.out.println(YELLOW + "No Lifelines Available!" + RESET);
            return;
        }
        if (audiencePoll == 1) System.out.println("1. Audience Poll");
        if (fiftyfifty == 1) System.out.println("2. Fifty-Fifty");
    }

    void startQuiz() {
        for (int i = 0; i < Questions.length; i++) {
            System.out.println(PURPLE + "\nQuestion " + (i + 1) + ":" + RESET);
            System.out.println(Questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(Options[i][j]);
            }

            if (audiencePoll != 0 || fiftyfifty != 0) {
                System.out.println(YELLOW + "5. Use Lifeline" + RESET);
                System.out.println(BLUE + "6. Quit the Quiz" + RESET);
                System.out.print("Enter your choice (1-6): ");
            } else {
                System.out.println(BLUE + "5. Quit the Quiz" + RESET);
                System.out.print("Enter your choice (1-5): ");
            }

            int choice = in.nextInt();

            if ((audiencePoll != 0 || fiftyfifty != 0) && choice == 5) {
                useLifeLine();
                System.out.print("Choose Lifeline (1 or 2): ");
                int lifeLineChoice = in.nextInt();
                lifeLine(i, lifeLineChoice);
                System.out.print("Enter your answer (1-4) or 6 to Quit: ");
                choice = in.nextInt();
            }

            if ((audiencePoll == 0 && fiftyfifty == 0 && choice == 5) || choice == 6) {
                System.out.println(BLUE + "You chose to quit. You take home ₹" + amount + RESET);
                showResult();
                playAgain();
                return;
            }

            if (choice == correctOptions[i]) {
                amount = cashPrize[i];
                System.out.println(GREEN + "Correct! You won ₹" + amount + RESET);
            } else {
                System.out.println(RED + "Wrong answer! Game Over." + RESET);
                amount = (i >= 5) ? cashPrize[4] : 0;
                showResult();
                playAgain();
                return;
            }
        }

        showResult();
        playAgain();
    }

    void lifeLine(int i, int lifeLineChoice) {
        if (lifeLineChoice == 1 && audiencePoll == 1) {
            System.out.println("Audience Poll:");
            for (int j = 0; j < 4; j++) {
                String percent = (j == correctOptions[i] - 1) ? "70%" : "10%";
                System.out.println(Options[i][j] + " - " + percent);
            }
            audiencePoll = 0;
        } else if (lifeLineChoice == 2 && fiftyfifty == 1) {
            System.out.println("50:50 Lifeline:");
            int correct = correctOptions[i] - 1;
            System.out.println(Options[i][correct]);
            for (int j = 0; j < 4; j++) {
                if (j != correct) {
                    System.out.println(Options[i][j]);
                    break;
                }
            }
            fiftyfifty = 0;
        } else {
            System.out.println(RED + "Invalid or already used Lifeline." + RESET);
        }
    }

    void showResult() {
        System.out.println(PURPLE + "\n===== Quiz Summary =====" + RESET);
        System.out.println("Candidate: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Total Prize: ₹" + amount);
        System.out.println(PURPLE + "========================" + RESET);
    }

    void playAgain() {
        System.out.print("\nDo you want to play again? (yes/no): ");
        String choice = in.next();
        if (choice.equalsIgnoreCase("yes")) {
            audiencePoll = 1;
            fiftyfifty = 1;
            amount = 0;
            startQuiz();
        } else {
            System.out.println("Thank you for playing, " + Name + "! Have a great day.");
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        Application a1 = new Application();
        a1.userData();
        a1.confirmDetails();
        a1.quizRules();
        a1.cashPrize();
        a1.confirmToStart();
        a1.startQuiz();
    }
}