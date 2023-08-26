import java.util.Scanner;
import java.util.*;
public class imi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int 취미활동_선택 = sc.nextInt();
        if (취미활동_선택 == 2) {//집에서 운동을 한다고 선택했을 경우의 상황
            System.out.println("오늘은 집에서 운동을 해야겠다.");
            System.out.println("어떤 운동을 하면 좋을까?");
            System.out.println("1. 푸쉬업 2.스쿼트 3.턱걸이");
            int 홈_트레이닝_운동_순서 = sc.nextInt();
            if (홈_트레이닝_운동_순서 == 1) {//푸쉬업을 선택했을 때 나오는 상황
                System.out.println("푸쉬업 운동 종류 중 어떤 걸 먼저하면 좋을까?");
                System.out.println("1. 스탠다드 푸쉬업 2.내로우 푸쉬업 3.와이드 푸쉬업 4.knee 푸쉬업");
                int 푸쉬업_종류_운동_순서_선택 = sc.nextInt();
                if (푸쉬업_종류_운동_순서_선택 == 1) {//스탠다드 푸쉬업을 선택했을 때 나올 수 있는 총 경우의 수
                    System.out.println("스탠다드 푸쉬업을 해야겠다.");
                    System.out.println("(스탠다드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("2.내로우 푸쉬업 3.와이드 푸쉬업 4.knee 푸쉬업");
                    int 스탠다드_푸쉬업_이후_운동_순서_선택 = sc.nextInt();
                    if (스탠다드_푸쉬업_이후_운동_순서_선택 == 2) {//스탠다드 푸쉬업-> 내로우 푸쉬업을 선택했을 때 나올 수 있는 총 경우의 수
                        System.out.println("내로우 푸쉬업을 해야겠다.");
                        System.out.println("(내로우 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("3.와이드 푸쉬업 4.knee 푸쉬업");
                        int 내로우_푸쉬업_이후_운동_순서_선택 = sc.nextInt();
                        if (내로우_푸쉬업_이후_운동_순서_선택 == 3) {
                            System.out.println("(와이드 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (내로우_푸쉬업_이후_운동_순서_선택 == 4) {
                            System.out.println("(knee 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#1 푸쉬업_종류_운동_순서_선택 == 1 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        } if (스탠다드_푸쉬업_이후_운동_순서_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                            System.out.println("2.내로우 푸쉬업 4.knee 푸쉬업");
                            int 와이드_푸쉬업_이후_운동_순서_선택 = sc.nextInt();
                            if (와이드_푸쉬업_이후_운동_순서_선택 == 2) {
                                System.out.println("내로우 푸쉬업을 해야겠다.");
                                System.out.println("(내로우 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                            } else if (와이드_푸쉬업_이후_운동_순서_선택 == 4) {
                                System.out.println("knee 푸쉬업을 해야겠다.");
                                System.out.println("(knee 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                            } else {//#2 푸쉬업_종류_운동_순서_선택 == 1 끝
                                System.out.println("프로그램을 종료하겠습니다.");
                            }
                        }

                    } else if (푸쉬업_종류_운동_순서_선택 == 3) {//스탠다드 푸쉬업-> 내로우 푸쉬업->와이드 푸쉬업을 선택했을 때 나올 수 있는 총 경우의 수
                        System.out.println("와이드 푸쉬업을 해야겠다.");
                        System.out.println("(와이드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("2.내로우 푸쉬업 4.knee 푸쉬업");
                        int 와이드_푸쉬업_이후_운동_순서_선택 = sc.nextInt();
                        if (와이드_푸쉬업_이후_운동_순서_선택 == 2) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (와이드_푸쉬업_이후_운동_순서_선택 == 4) {
                            System.out.println("knee 푸쉬업을 해야겠다.");
                            System.out.println("(knee 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                        } else {//#2 푸쉬업_종류_운동_순서_선택 == 1 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }

                    } else if (푸쉬업_종류_운동_순서_선택 == 4) {//스탠다드 푸쉬업-> 내로우 푸쉬업->와이드 푸쉬업->knee 푸쉬업을 선택했을 때 나올 수 있는 총 경우의 수
                        System.out.println("knee 푸쉬업을 해야겠다.");
                        System.out.println("(knee 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("2.내로우 푸쉬업 3.knee 푸쉬업");
                        int knee_푸쉬업_이후_운동_순서_선택 = sc.nextInt();
                        if (knee_푸쉬업_이후_운동_순서_선택 == 2) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else if (knee_푸쉬업_이후_운동_순서_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else {//#3 푸쉬업_종류_운동_순서_선택 == 1 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    }
                } else if (푸쉬업_종류_운동_순서_선택 == 2) {//내로우 푸쉬업을 선택했을 때 나올 수 있는 총 경우의 수
                    System.out.println("내로우 푸쉬업을 해야겠다.");
                    System.out.println("(내로우 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 스탠다드 푸쉬업 3.와이드 푸쉬업 4.knee 푸쉬업");
                    int 내로우_푸쉬업_2_이후_운동_순서_선택 = sc.nextInt();
                    if (내로우_푸쉬업_2_이후_운동_순서_선택 == 1) {//내로우 푸쉬업-> 스탠다드 푸쉬업
                        System.out.println("스탠다드 푸쉬업을 해야겠다.");
                        System.out.println("(스탠다드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("3.와이드 푸쉬업 4.knee 푸쉬업");
                        int 스탠다드_푸쉬업_2_이후_운동_순서_선택 = sc.nextInt();
                        if (스탠다드_푸쉬업_2_이후_운동_순서_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (스탠다드_푸쉬업_2_이후_운동_순서_선택 == 4) {
                            System.out.println("knee 푸쉬업을 해야겠다.");
                            System.out.println("(knee 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#4 푸쉬업_종류_운동_순서_선택 == 2 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 3) {//내로우 푸쉬업-> 스탠다드 푸쉬업 -> 와이드 푸쉬업
                        System.out.println("와이드 푸쉬업을 해야겠다.");
                        System.out.println("(와이드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 4.knee 푸쉬업");
                        int 와이드_푸쉬업_2_이후_운동_순서_선택 = sc.nextInt();
                        if (와이드_푸쉬업_2_이후_운동_순서_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (와이드_푸쉬업_2_이후_운동_순서_선택 == 4) {
                            System.out.println("knee 푸쉬업을 해야겠다.");
                            System.out.println("(knee 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#5 푸쉬업_종류_운동_순서_선택 == 2 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 4) {//내로우 푸쉬업-> 스탠다드 푸쉬업 -> 와이드 푸쉬업 ->knee 푸쉬업
                        System.out.println("knee 푸쉬업을 해야겠다.");
                        System.out.println("(knee 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 3. 와이드 푸쉬업");
                        int knee_푸쉬업_2_이후_운동_순서_선택 = sc.nextInt();
                        if (knee_푸쉬업_2_이후_운동_순서_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else if (knee_푸쉬업_2_이후_운동_순서_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#6 푸쉬업_종류_운동_순서_선택 == 2 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    }
                } else if (푸쉬업_종류_운동_순서_선택 == 3) {//와이드 푸쉬업을 선택했을 때 총 경우의 수
                    System.out.println("와이드 푸쉬업을 해야겠다.");
                    System.out.println("(와이드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 스탠다드 푸쉬업 2.내로우 푸쉬업 4.knee 푸쉬업");
                    int 와이드_푸쉬업_3_이후_운동_순서_선택 = sc.nextInt();
                    if (와이드_푸쉬업_3_이후_운동_순서_선택 == 1) {//와이드 푸쉬업-> 스탠다드 푸쉬업
                        System.out.println("스탠다드 푸쉬업을 해야겠다.");
                        System.out.println("(스탠다드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("2.내로우 푸쉬업 4.knee 푸쉬업");
                        int 스탠다드_푸쉬업_3_이후_운동_순서_선택 = sc.nextInt();
                        if (스탠다드_푸쉬업_3_이후_운동_순서_선택 == 2) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (스탠다드_푸쉬업_3_이후_운동_순서_선택 == 4) {
                            System.out.println("knee 푸쉬업을 해야겠다.");
                            System.out.println("(knee 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                        } else {//#7 푸쉬업_종류_운동_순서_선택 == 3 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 2) {//와이드 푸쉬업-> 스탠다드 푸쉬업-> 내로우 푸쉬업
                        System.out.println("내로우 푸쉬업을 해야겠다.");
                        System.out.println("(내로우 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 4.knee 푸쉬업");
                        int 내로우_푸쉬업_3_이후_운동_선택 = sc.nextInt();
                        if (내로우_푸쉬업_3_이후_운동_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)knee 푸쉬업을 마무리로 해야겠다.");
                        } else if (내로우_푸쉬업_3_이후_운동_선택 == 4) {
                            System.out.println("knee 푸쉬업을 해야겠다.");
                            System.out.println("(knee 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#7 푸쉬업_종류_운동_순서_선택 == 3 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 4) {//와이드 푸쉬업-> 스탠다드 푸쉬업-> 내로우 푸쉬업->knee 푸쉬업
                        System.out.println("knee 푸쉬업을 해야겠다.");
                        System.out.println("(knee 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 2.내로우 푸쉬업");
                        int knne_푸쉬업_3_이후_운동_선택 = sc.nextInt();
                        if (knne_푸쉬업_3_이후_운동_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                        } else if (knne_푸쉬업_3_이후_운동_선택 == 2) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#8 푸쉬업_종류_운동_순서_선택 == 3 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    }
                } else if (푸쉬업_종류_운동_순서_선택 == 4) {//knee 푸쉬업을 선택했을 때 총 경우의 수
                    System.out.println("knee 푸쉬업을 해야겠다.");
                    System.out.println("1. 스탠다드 푸쉬업 2.내로우 푸쉬업 3.와이드 푸쉬업");
                    int knee_푸쉬업_4_이후_운동_선택 = sc.nextInt();
                    if (knee_푸쉬업_4_이후_운동_선택 == 1) {//knee 푸쉬업-> 스탠다드 푸쉬업
                        System.out.println("스탠다드 푸쉬업을 해야겠다.");
                        System.out.println("(스탠다드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("2.내로우 푸쉬업 3. 와이드 푸쉬업");
                        int 스탠다드_푸쉬업_4_이후_운동_선택 = sc.nextInt();
                        if (스탠다드_푸쉬업_4_이후_운동_선택 == 2) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else if (스탠다드_푸쉬업_4_이후_운동_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                        } else {//#9 푸쉬업_종류_운동_순서_선택 == 4 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 2) {//knee 푸쉬업-> 스탠다드 푸쉬업->내로우 푸쉬업
                        System.out.println("내로우 푸쉬업을 해야겠다.");
                        System.out.println("(내로우 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 3.와이드 푸쉬업");
                        int 내로우_푸쉬업_4_이후_운동_선택 = sc.nextInt();
                        if (내로우_푸쉬업_4_이후_운동_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)와이드 푸쉬업을 마무리로 해야겠다.");
                        } else if (내로우_푸쉬업_4_이후_운동_선택 == 3) {
                            System.out.println("와이드 푸쉬업을 해야겠다.");
                            System.out.println("(와이드 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#9 푸쉬업_종류_운동_순서_선택 == 4 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    } else if (푸쉬업_종류_운동_순서_선택 == 3) {//knee 푸쉬업-> 스탠다드 푸쉬업-> 내로우 푸쉬업-> 와이드 푸쉬업
                        System.out.println("와이드 푸쉬업을 해야겠다.");
                        System.out.println("(와이드 푸쉬업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                        System.out.println("1. 스탠다드 푸쉬업 2.내로우 푸쉬업");
                        int 와이드_푸쉬업_4_이후_운동_선택 = sc.nextInt();
                        if (와이드_푸쉬업_4_이후_운동_선택 == 1) {
                            System.out.println("스탠다드 푸쉬업을 해야겠다.");
                            System.out.println("(스탠다드 푸쉬업을 끝낸 후)내로우 푸쉬업을 마무리로 해야겠다.");
                        } else if (와이드_푸쉬업_4_이후_운동_선택 == 1) {
                            System.out.println("내로우 푸쉬업을 해야겠다.");
                            System.out.println("(내로우 푸쉬업을 끝낸 후)스탠다드 푸쉬업을 마무리로 해야겠다.");
                        } else {//#10 푸쉬업_종류_운동_순서_선택 == 4 끝
                            System.out.println("프로그램을 종료하겠습니다.");
                        }
                    }
                }
            } else if (홈_트레이닝_운동_순서 == 2) {
                System.out.println("스쿼트 운동 종류는 어떻게 하면 좋을까?");
                System.out.println("1. 스쿼트 2. 내로우 스쿼트 3. 와이드 스쿼트");
                int 스쿼트_운동_순서 = sc.nextInt();
                if (스쿼트_운동_순서 == 1) {//집에서 운동-> 스쿼트를 선택했을 때 총 경우의 수
                    System.out.println("스쿼트를 해야겠다.");
                    System.out.println("(스쿼트 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("2. 내로우 스쿼트 3. 와이드 스쿼트");
                    int 스쿼트_이후_운동_선택 = sc.nextInt();
                    if (스쿼트_이후_운동_선택 == 2) {
                        System.out.println("내로우 스쿼트를 해야겠다.");
                        System.out.println("(스쿼트 끝낸 후)와이드 스쿼트를 마무리로 해야겠다.");
                    } else if (스쿼트_이후_운동_선택 == 3) {
                        System.out.println("와이드 스쿼트를 해야겠다.");
                        System.out.println("(와이드 스쿼트 끝낸 후)내로우 스쿼트를 마무리로 해야겠다.");
                    } else {//#1 스쿼트_운동_순서_선택 == 1 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                } else if (스쿼트_운동_순서 == 2) {// 내로우 스쿼트를 선택했을 때 총 경우의 수
                    System.out.println("내로우 스쿼트를 해야겠다.");
                    System.out.println("(내로우 스쿼트 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 스쿼트 3. 와이드 스쿼트");
                    int 내로우_스쿼트_이후_운동_선택 = sc.nextInt();
                    if (내로우_스쿼트_이후_운동_선택 == 1) {
                        System.out.println("스쿼트를 해야겠다.");
                        System.out.println("(스쿼트 끝낸 후)와이드 스쿼트를 마무리로 해야겠다.");
                    } else if (내로우_스쿼트_이후_운동_선택 == 3) {
                        System.out.println("와이드 스쿼트를 해야겠다.");
                        System.out.println("(와이드 스쿼트 끝낸 후)스쿼트를 마무리로 해야겠다.");
                    } else {//#2 스쿼트_운동_순서_선택 == 2 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                } else if (스쿼트_운동_순서 == 3) {// 와이드 스쿼트를 선택했을 때 총 경우의 수
                    System.out.println("와이드 스쿼트를 해야겠다.");
                    System.out.println("(와이드 스쿼트 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 스쿼트 2. 내로우 스쿼트");
                    int 와이드_스쿼트_이후_운동_선택 = sc.nextInt();
                    if (와이드_스쿼트_이후_운동_선택 == 1) {
                        System.out.println("스쿼트를 해야겠다.");
                        System.out.println("(스쿼트 끝낸 후)내로우 스쿼트를 마무리로 해야겠다.");
                    } else if (와이드_스쿼트_이후_운동_선택 == 2) {
                        System.out.println("내로우 스쿼트를 해야겠다.");
                        System.out.println("(내로우 스쿼트 끝낸 후)스쿼트를 마무리로 해야겠다.");
                    } else {//#2 스쿼트_운동_순서_선택 == 3 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                }
            } else if (홈_트레이닝_운동_순서 == 3) {
                System.out.println("풀업 운동 종류는 어떻게 하면 좋을까?");
                System.out.println("1.풀업 2. 내로우 풀업 3. 와이드 풀업");
                int 풀업_운동_순서_선택 = sc.nextInt();
                if (풀업_운동_순서_선택 == 1) {//집에서 운동-> 풀업을 선택했을 때 총 경우의 수
                    System.out.println("풀업을 해야겠다.");
                    System.out.println("(풀업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("2. 내로우 풀업 3. 와이드 풀업");
                    int 풀업_이후_운동_순서_선택 = sc.nextInt();
                    if (풀업_이후_운동_순서_선택 == 2) {
                        System.out.println("내로우 풀업을 해야겠다.");
                        System.out.println("(내로우 풀업을 끝낸 후)와이드 풀업을 마무리로 해야겠다.");
                    } else if (풀업_이후_운동_순서_선택 == 3) {
                        System.out.println("와이드 풀업을 해야겠다.");
                        System.out.println("(와이드 풀업을 끝낸 후)내로우 풀업을 마무리로 해야겠다.");
                    } else {//#1 풀업_운동_순서_선택 == 1 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                } else if (풀업_운동_순서_선택 == 2) {//내로우 풀업을 선택했을 때 총 경우의 수
                    System.out.println("내로우 풀업을 해야겠다.");
                    System.out.println("(내로우 풀업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 풀업 3. 와이드 풀업");
                    int 내로우_풀업_이후_운동_순서_선택 = sc.nextInt();
                    if (내로우_풀업_이후_운동_순서_선택 == 1) {
                        System.out.println("풀업을 해야겠다.");
                        System.out.println("(풀업을 끝낸 후)와이드 풀업을 마무리로 해야겠다.");
                    } else if (내로우_풀업_이후_운동_순서_선택 == 3) {
                        System.out.println("와이드 풀업을 해야겠다.");
                        System.out.println("(와이드 풀업을 끝낸 후)풀업을 마무리로 해야겠다.");
                    } else {//#1 풀업_운동_순서_선택 == 2 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                } else if (풀업_운동_순서_선택 == 3) {//와이드 풀업을 선택했을 때 총 경우의 수
                    System.out.println("와이드 풀업을 해야겠다.");
                    System.out.println("(와이드 풀업을 끝낸 후)다음 운동 순서는 어떻게 하면 좋울까?");
                    System.out.println("1. 풀업 2. 내로우 풀업");
                    int 와이드_풀업_이후_운동_순서_선택 = sc.nextInt();
                    if (와이드_풀업_이후_운동_순서_선택 == 1) {
                        System.out.println("풀업을 해야겠다.");
                        System.out.println("(풀업을 끝낸 후)내로우 풀업을 마무리로 해야겠다.");
                    } else if (와이드_풀업_이후_운동_순서_선택 == 2) {
                        System.out.println("내로우 풀업을 해야겠다.");
                        System.out.println("(내로우 풀업을 끝낸 후)풀업을 마무리로 해야겠다.");
                    } else {//#1 풀업_운동_순서_선택 == 3 끝
                        System.out.println("프로그램을 종료하겠습니다.");
                    }
                }
            }
        }
    }
}