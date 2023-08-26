/*
import java.util.ArrayList;
import java.util.Scanner;

public class imi {
    public static void main(String[] args) {
    System.out.println("스쿼트를 먼저 해야겠다.");
                            System.out.println("(운동 중 다음과 같은 상황이 발생)");
                            System.out.println("1.배가 아픈 경우 2.바벨 원판 한 쪽만 끼워진 경우 3.통증이 너무 심한 경우");
                            int 운동중_난감한_상황 = sc.nextInt();
                            if (운동중_난감한_상황 == 1) {//운동 진행중 배가 아픈 경우의 상황
                                System.out.println("(운동 중)배가 너무 아픈데 어떡하면 좋을까?");
                                System.out.println("1.운동을 진행한다. 2.화장실을 간다.");
                                int 운동_진행중_배가_아픈_상황 = sc.nextInt();
                                if (운동_진행중_배가_아픈_상황 == 1) {
                                    System.out.println("하다보면 괜찮아지겠지");
                                    System.out.println("스쿼트 중량 설정을 어떻게 하면 좋을까?");
                                    System.out.println("1.140kg 2.120kg 3.100kg 4.80kg 5.60kg");
                                    int 중량_설정 = sc.nextInt();
                                    if (중량_설정 == 1) { //140kg 중량을 설정했을 경우
                                        System.out.println("140kg로 3회 3세를 해야겠다.");
                                        System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                                        System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                                        int 스쿼트_운동_이후_운동_순서_선택 = sc.nextInt();
                                        if (스쿼트_운동_이후_운동_순서_선택 == 2) {
                                            System.out.println("레그프레스를 해야겠다.");
                                            System.out.println("레그 프레스 중량 설정을 어떻게 하면 좋을까?");
                                            System.out.println("1.400kg 2.300kg 3.200kg 4.150kg 5.100kg");
                                            int 레그_프레스_중량_설정 = sc.nextInt();
                                            if (레그_프레스_중량_설정 == 1) {
                                                System.out.println("400kg 1rm을 해야겠다.");
                                            } else if (레그_프레스_중량_설정 == 2) {
                                                System.out.println("300kg 3회 3세트를 해야겠다.");
                                                System.out.println("(레그프레스를 끝낸 후) 레그익스텐션 중량 설정을 어떻게 하면 좋을까?");
                                                System.out.println("1.60kg 2.50kg 3. 40kg 4.30kg 4.20kg");
                                                int 레그_익스텐션_중량_설정 = sc.nextInt();
                                                if (레그_익스텐션_중량_설정 == 1) {
                                                    System.out.println("60kg로 8회 3세트를 해야겠다.");
                                                } else if (레그_익스텐션_중량_설정 == 2) {
                                                    System.out.println("50kg 12회 3세트를 해야겠다.");
                                                } else if (레그_익스텐션_중량_설정 == 3) {
                                                    System.out.println("40kg 15회 3세트를 해야겠다.");
                                                } else if (레그_익스텐션_중량_설정 == 4) {
                                                    System.out.println("30kg 20회 3세트를 해야겠다.");
                                                } else if (레그_익스텐션_중량_설정 == 5) {
                                                    System.out.println("30kg 30회 3세트를 해야겠다.");
                                                } else {
                                                    System.out.println("하체 운동을 완료하였습니다.");
                                                }
                                            } else if (레그_프레스_중량_설정 == 3) {
                                                System.out.println("200kg 20회 3세트를 해야겠다.");
                                            } else if (레그_프레스_중량_설정 == 4) {
                                                System.out.println("150kg 30회 3세트를 해야겠다.");
                                            } else if (레그_프레스_중량_설정 == 5) {
                                                System.out.println("100kg 40회 3세트를 해야겠다.");
                                            }

                                        }
                                    }

                                }
                            }


        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================취미 활동을 시작하겠습니다.=============================================================");
        System.out.println("다음 보기 중 취미활동을 선택해주세요.");
        System.out.println("1.헬스장으로 이동한다 2.집에서 운동을 한다. 3.과제를 한다.");
        int 취미활동_선택 = sc.nextInt();
        if (취미활동_선택 == 1) { // 헬스장으로 이동을 선택했을 때 상황
            System.out.println("오늘의 옷 스타일은 어떻게 하면 좋을까?");
            System.out.println("--------------상의-----------------");
            System.out.println("1. 난방 셔츠 2. 오버핏 반팔 티셔츠 3. 멜란지 티셔츠");
            int 옷_상의_선택 = sc.nextInt(); //상의 입력 받기
            System.out.println("--------------하의-----------------");
            System.out.println("4. 벌룬핏 트레이닝 반바지 5. 검정 슬랙스 6. 벌룬핏 베이직 바지");
            int 옷_하의_선택 = sc.nextInt();// 하의 입력 받기
            if (옷_상의_선택 == 1 && 옷_하의_선택 == 4) {// 순서 상의 입력 받기 -> 하의 입력 받기(순서대로)
                System.out.println("난방 셔츠와 벌룬핏 트레이닝 반바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 1 && 옷_하의_선택 == 5) {
                System.out.println("난방 셔츠와 벌룬핏 반바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 1 && 옷_하의_선택 == 6) {
                System.out.println("난방 셔츠와 벌룬핏 베이직 바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 2 && 옷_하의_선택 == 4) {
                System.out.println("오버핏 반팔 티셔츠와 벌룬핏 트레이닝 반바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 2 && 옷_하의_선택 == 5) {
                System.out.println("오버핏 반팔 티셔츠와 검정 슬랙스를 선택하셨습니다.");
            } else if (옷_상의_선택 == 2 && 옷_하의_선택 == 6) {
                System.out.println("오버핏 반팔 티셔츠와 트레이닝 베이직 바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 3 && 옷_하의_선택 == 4) {
                System.out.println("멜란지 티셔츠와 벌룬핏 트레이닝 반바지를 선택하셨습니다.");
            } else if (옷_상의_선택 == 3 && 옷_하의_선택 == 5) {
                System.out.println("멜란지 티셔츠와 검정 슬랙스를 선택하셨습니다.");
            } else if (옷_상의_선택 == 3 && 옷_하의_선택 == 6) {
                System.out.println("멜란지 티셔츠와 벌룬핏 베이직 바지를 선택하셨습니다.");
            } else {
                System.out.println("잘못 입력하셨습니다. 처음으로 돌아가세요");
            }//#1 상의 && 하의 선택 끝
            System.out.println("좋아 헬스장으로 이동하자");
            System.out.println("8층을 누르고 헬스장 앞 도착 후 회원증을 인식하는 기계에 휴대폰 어플에 찍힌 인증 코드를 갖다댄다.");
            System.out.println("기계에서 인식하는 중 회원권 기간이 남았을 경우 true 아니면 false를 선택해주세요.");
            boolean 회원권 = sc.nextBoolean();//회원권 TRUE OR FALSE
            if (회원권) { // 회원권 == true일 때
                System.out.println("회원 인증이 완료되었습니다.");
                System.out.println("(문이 열립니다.)");
            } else {// 회원권이 false로 첫번째 종료
                System.out.println("회원권이 만료되었습니다. 입장이 불가능합니다.");
            }
            System.out.println("(회원복을 갈아입고)오늘은 어떤 부위를 하면 좋을까?");//한 부위만 운동 가능
            System.out.println("1.등 2. 가슴 3. 다리 4. 어깨 5. 팔");
            int 운동할_부위_선택 = sc.nextInt();// 운동할 부위 입력
            if (운동할_부위_선택 == 1) {// 운동 부위가 등 일때
                System.out.println("오늘은 등 운동을 해야겠다.");
                System.out.println("1.렛풀다운 2.데드리프트 3.바벨로우");
                System.out.println("어떤 것을 먼저 하면 좋을까?");
                int 등_운동_순서 = sc.nextInt();//등 운동 종목 입력받기
                if (등_운동_순서 == 1) {//운동 횟수 종류 4가지 중 1번 선택
                    System.out.println("렛풀다운을 해야겠다.");
                    System.out.println("(렛풀다운을 하러 이동하다가 다른 사람이 하고 있는 것을 목격한다.) 당신의 선택은?");
                    System.out.println("1.다른 종목을 한다. 2. 같이 할 수 있는지 물어본다. 3.끝날 때까지 기다린다.");
                    int 렛풀다운_사람이_사용하고_있는_경우 = sc.nextInt();//자리가 없을 때
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {//6~8회 입력 받을 시 true를 입력받으면 아래 실행문 실행
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다음 종목으로 이동됩니다.");
                }// workout == 1 && reps 끝
            } else if (workout == 2) { //workout == 2(오버헤드)를 선택 시 나오는 실행문
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();//운동 횟수 종류 4가지 중 선택
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다음 종목으로 이동됩니다.");
                } //work out == 2 끝 && reps 끝
            } else if (workout == 3) { //work == 3 (스쿼트)
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();// 운동 횟수 종류 4가지 중 선택
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (workout == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (workout == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt(); //운동 횟수 4가지 종류 중 선택
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } //work == 5 && reps 끝
            } else if (workout == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } // workout == 6 && reps 끝
            } else if (workout == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } //운동 7가지 종목 선택 && reps 끝
            } else {
                System.out.println("잘 못 입력하셨습니다.");
            } //두 번째 종목 고르기
            System.out.println("2번째 종목을 선택해주세요.");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int second = sc.nextInt(); //운동 7가지 중 선택
            if (second == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (second == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (second == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (second == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (second == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (second == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (second == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else {
                System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
            }
            System.out.println("3번째 종목을 선택해주세요");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int third = sc.nextInt();
            if (third == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (third == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (third == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (third == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (third == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (third == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (third == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else {
                System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
            }
            System.out.println("4번째 종목을 선택해주세요.");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int forth = sc.nextInt();
            if (forth == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (forth == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (forth == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (forth == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (forth == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (forth == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (forth == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else {
                System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
            }
            System.out.println("5번째 종목을 선택해주세요.");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int five = sc.nextInt();
            if (five == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (five == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (five == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (five == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (five == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (five == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (five == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else {
                System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
            }
            System.out.println("6번째 종목을 선택해주세요.");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int six = sc.nextInt();
            if (six == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (six == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (six == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (six == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (six == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (six == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (six == 7) {
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else {
                System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
            }
            System.out.println("일곱번째 종목을 선택해주세요.");
            System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
            int seven = sc.nextInt();
            if (seven == 1) {
                System.out.println("1번 벤치프레스를 선택하셨습니다.");
                System.out.println("음 가슴이 웅장해지는 시간이구먼");
                System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                    System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                    boolean overcome = sc.nextBoolean();
                    if (overcome == true) {
                        System.out.println("들어!!! 이 자식아 (끄으응)성공");
                    } else {
                        System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                    }
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (seven == 2) {
                System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                System.out.println("코코넛 어깨 조아쒀");
                System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("다른 거 할까?");
                }
            } else if (seven == 3) {
                System.out.println("3번 스쿼트를 선택하셨습니다.");
                System.out.println("아 하기 싫어~~~");
                System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (seven == 4) {
                System.out.println("4번 데드리프트를 선택하셨습니다.");
                System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (seven == 5) {
                System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                System.out.println("자극충 조아쒀");
                System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                } else {
                    System.out.println("아 다른거 할까?");
                }
            } else if (seven == 6) {
                System.out.println("6번 바벨컬을 선택하셨습니다.");
                System.out.println("팔 찢는 느낌으로다가 해보자고");
                System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                }
            } else if (seven == 7) {//7번째 종목 선택 시
                System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                System.out.println("삼두 먹방 조아쒀");
                System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                int reps = sc.nextInt();
                if (reps == 1) {
                    System.out.println("6~8회를 선택하셨습니다.");
                    System.out.println("중량감 있게 4세트 가보자");
                    return;
                } else if (reps == 2) {
                    System.out.println("8~12회를 선택하셨습니다.");
                    System.out.println("역시 8~12회 국룰 근비대 횟수지");
                    return;
                } else if (reps == 3) {
                    System.out.println("15~20회를 선택하셨습니다.");
                    System.out.println("자극충은 15~20회지!");
                    return;
                } else if (reps == 4) {
                    System.out.println("50회를 선택하셨습니다.");
                    System.out.println("100회 아닌게 어디야 해보자고");
                    return;
                } else if (reps == 5) {
                    System.out.println("100회를 선택하셨습니다.");
                    System.out.println("침 질질 흘리겠구먼");
                    return;
                }
            } else {//7번째 종목 입력 끝
                System.out.println("다음을 위해 휴식이다.");
                return;
            }
            System.out.println("운동 끝 ~~ 샤워를 끝내고 집으로 이동한다.");
            System.out.println("(집에 도착하여 배달의 민족 어플을 킨다.)수요일에 20000원 이상이면 모든 가게에서 30% 할인받네");
            System.out.println("메뉴는 어떤 걸로 먹을까?");
            System.out.println("1.피자 2.국밥");
            int menu = sc.nextInt();
            //할인문제 problem 1. 피자 구매
            //수요일이면 할인받고 주문, 수요일이 아니어서 할인없이 주문, 주문 취소
            if (menu == 1) {
                System.out.println("1번 피자를 선택하셨습니다.");
                System.out.println("반올림 피자 시켜야겠다.");
                System.out.println("고구마 피자가 얼마지?");
                int price = sc.nextInt();
                if (price >= 20000) {// 20000원 이상
                    System.out.println(price + "원이네");
                    System.out.println("오늘이 무슨 요일이더라?");
                    String today = sc.next();
                    if (today.equals("수")) {// 수요일이면
                        System.out.println("수요일이네 할인 쿠폰 써야겠다.");
                        double total = price - (price + 3000) * 0.3;
                        System.out.println("배달료 3000원 더해서 " + total + "원 이겠네");
                    } else if (!today.equals("수")) {//수요일인 경우
                        System.out.println("수요일이 아니구나 할인없이 구매해야겠다.");
                        int total = price + 3000;
                        System.out.println(total + "원 나오네");
                    }
                } else {//수요일도 아니고 먹고 싶은 메뉴 주문 금액이 20000원 이상이 아닌 경우
                    System.out.println("집 밥 먹어야겠다.");
                } // price 가격이 얼마인지 모르는 상태에서 수요일이면 20000원이어서 모든 가게 할인 쿠폰을 사용하려고 하는 상황
            } else if (menu == 2) {
                System.out.println("2번 국밥을 선택하셨습니다.");
                System.out.println("더워도 국밥 못 참지~~");
                System.out.println("배달료가 3000원인게 아쉽네");
                System.out.println("오늘이 무슨 요일이더라?");

                int price = 0;
                int store = 3000; // 가게 전용 쿠폰
                double store1 = 0.3; // 모든 가게 할인 적용 쿠폰
                int fee = 3000; // 배달료
                String today = sc.next();

                if (today.equals("수")) { // 수요일인 경우
                    System.out.println("수요일인데 가게 쿠폰아끼고 모든 가게 할인 적용 쿠폰 사용해야겠다.");
                    System.out.println("국밥이 얼마더라?");
                    price = sc.nextInt();// 가격 설정
                    if (price >= 20000) { // 20000이상인 경우
                        System.out.println(price + "원이네 전체 할인 쿠폰 사용해야겠다,");
                        int total = (int) ((int) price - ((price + fee) * store1));
                        System.out.println(total + "원 결제하겠습니다.");
                    }
                } else if (!today.equals("수")) {//수요일 아닌 경우
                    System.out.println("아 오늘은 수요일이 아니구나");
                    System.out.println("국밥이 얼마더라?");
                    price = sc.nextInt();
                    if (price >= 15000) { // 15000원 이상인 경우
                        System.out.println(price + "원이네 가게 할인 쿠폰 사용해야겠다,");
                        int total = price + fee - store;
                        System.out.println(total + "원 결제하겠습니다.");
                    }
                }
            } else {
                System.out.println("안 먹어야겠다.");
                return;
            }
            // menu == 2 끝
            System.out.println("오늘 집에서 해야되나 카페에서 해야되나?");
            System.out.println("1. 집에서 한다 2. 카페에서 한다.");
            int study = sc.nextInt(); //집과 카페 선택하는 것을 숫자로 1 , 2로 입력 받기
            if (study == 1) {// 1. 집 2.카페 중 1번을 선택
                System.out.println("날씨도 더운데 집에서 해야겠다.");
                System.out.println("(노트북 전원을 킨다.)오늘 어떤 걸 해야 되더라?");
                System.out.println("우선 순위 1.블로그 작성 2.내용 복습");
                int list = sc.nextInt();
                if (list == 1) {
                    System.out.println("블로그 작성을 시작해보자");
                    System.out.println("오늘 작성해야 되는게 뭐더라?");
                    System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                    int write = sc.nextInt();
                    if (write == 1) {
                        System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");

                    } else if (write == 2) {
                        System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                    } else if (write == 3) {
                        System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                    } else if (write == 4) {
                        System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                    } else {
                        System.out.println("프로그램을 종료하겠습니다.");
                        return;
                    }
                } else if (list == 2) {
                    System.out.println("그동안 배웠던 블로그 작성하면서 배웠던 내용에 대해 복습해야겠다.");
                    System.out.println("내용은 어떤 걸 복습하면 좋을까?");
                    System.out.println("1.변수와 자료형 2.git branch 3.github와 intellij 연동");
                    int review = sc.nextInt();
                    if (review == 1) {
                        System.out.println("변수는 원하는 데이터 값을 자료형을 통해 표현하는 것을 변수라고 한다.");
                    } else if (review == 2) {
                        System.out.println("git branch는 각각의 독립된 공간에서 다른 브랜치의 영역을 확인할 수 없다.");
                    } else if (review == 3) {
                        System.out.println("git commit을 생성하고 git remote를 통해 github에 있는 원격 주소와 연동한다.");
                    } else {
                        System.out.println("잘 못 입력하셨습니다.");
                        return;
                    }
                }
                System.out.println("오늘 저녁 메뉴는 어떤 걸 먹으면 좋을까?");
                System.out.println("1.계란후라이 2.닭가슴살 3.돼지고기 4.소고기");
                int food = sc.nextInt();
                if (food == 1) {
                    ArrayList egg_fried = new ArrayList();//재료를 0~5번 인덱스에 내용 추가
                    System.out.println("계란후라이나 먹어야겠다. 재료가 뭐뭐 있더라?");
                    System.out.println("1.식용유  2.계란  3. 소금 4. 간장 5. 밥 6. 샐러드");
                    System.out.println("조리 과정을 시작하겠습니다.");
                    System.out.println("계란 후라이 후딱 먹어야겠다.");

                    egg_fried.add(0, "후라이팬에 식용유를 두르고 기름을 데운다.");
                    egg_fried.add(1, "후라이팬 위에 계란을 푼다.");
                    egg_fried.add(2, "계란에 소금을 약간 뿌려준다.");
                    egg_fried.add(3, "계란에 간장을 약간 뿌려준다.");
                    egg_fried.add(4, "후라이팬에 밥을 먼저 넣고 계란을 올린다.");
                    egg_fried.add(5, "샐러드를 갖다 뿌린다.");

                    if (egg_fried.contains("후라이팬에 식용유를 두르고 기름을 데운다.")) {
                        System.out.println(egg_fried.get(0));
                    } else if (egg_fried.contains("후라이팬 위에 계란을 푼다.")) {
                        System.out.println(egg_fried.get(1));
                    } else if (egg_fried.contains("계란에 소금을 약간 뿌려준다.")) {
                        System.out.println(egg_fried.get(2));
                    } else if (egg_fried.contains("계란에 간장을 약간 뿌려준다.")) {
                        System.out.println(egg_fried.get(3));
                    } else if (egg_fried.contains("후라이팬에 밥을 먼저 넣고 계란을 올린다.")) {
                        System.out.println(egg_fried.get(4));
                    } else if (egg_fried.contains("샐러드를 갖다 뿌린다.")) {
                        System.out.println(egg_fried.get(5));
                    } //food == 1 종료
                } else if (food == 2) {
                    ArrayList chicken_chest = new ArrayList();//재료를 0~5번 인덱스에 내용 추가
                    chicken_chest.add(0, "닭가슴살을 손질하여 준비한다.");
                    chicken_chest.add(1, "손질된 닭가슴살 위에 소금을 투하한다.");
                    chicken_chest.add(2, "후추를 뿌린다.");
                    chicken_chest.add(3, "후라이팬에 식용유를 뿌리고 준비해뒀던 닭가슴살을 투하한다.");
                    chicken_chest.add(4, "다진 마늘을 뿌린다.");
                    chicken_chest.add(5, "마무리 장식으로 샐러드를 갖다 뿌린다.");

                    System.out.println("닭가슴살 요리를 해야겠다. 재료가 뭐뭐 있더라?");
                    System.out.println("1. 닭가슴살 2. 소금 3. 후추 4. 식용유 5. 다진 마늘 6.샐러드");
                    System.out.println("재료를 순서대로 입력해주세요.");

                    if (chicken_chest.contains("닭가슴살을 손질하여 준비한다.")) {
                        System.out.println(chicken_chest.get(0));
                    } else if (chicken_chest.contains("손질된 닭가슴살 위에 소금을 투하한다.")) {
                        System.out.println(chicken_chest.get(1));
                    } else if (chicken_chest.contains("후추를 뿌린다.")) {
                        System.out.println(chicken_chest.get(2));
                    } else if (chicken_chest.contains("후라이팬에 식용유를 뿌리고 준비해뒀던 닭가슴살을 투하한다.")) {
                        System.out.println(chicken_chest.get(3));
                    } else if (chicken_chest.contains("다진 마늘을 뿌린다.")) {
                        System.out.println(chicken_chest.get(4));
                    } else if ((chicken_chest.contains("마무리 장식으로 샐러드를 갖다 뿌린다."))) {
                        System.out.println(chicken_chest.get(5));
                    }
                    System.out.println("요리 참 쉽지요~~");
                } //food == 2 종료
                else if (food == 3) {
                    ArrayList pork_bbq = new ArrayList();//재료를 0~3번 인덱스에 내용 추가
                    pork_bbq.add(0, "돼지고기를 굽기 좋게 가위로 짤라 놓는다.");
                    pork_bbq.add(1, "돼지고기에 냅다 소금을 뿌린다.");
                    pork_bbq.add(2, "간을 더하기 위해 고기에 후추를 뿌린다.");
                    pork_bbq.add(3, "건강을 위해 마지막으로 샐러드를 갖다 뿌린다.");
                    System.out.println("돼지고기 구이를 먹어야겠다. 재료가 뭐뭐 있더라?");
                    System.out.println("1. 돼지고기 2. 소금 3. 후추 4. 샐러드");
                    System.out.println("재료를 순서대로 입력해주세요.");

                    if (pork_bbq.contains("돼지고기를 굽기 좋게 가위로 짤라 놓는다.")) {
                        System.out.println(pork_bbq.get(0));
                    } else if (pork_bbq.contains("돼지고기에 냅다 소금을 뿌린다.")) {
                        System.out.println(pork_bbq.get(1));
                    } else if (pork_bbq.contains("간을 더하기 위해 고기에 후추를 뿌린다.")) {
                        System.out.println((pork_bbq.get(2)));
                    } else if (pork_bbq.contains("건강을 위해 마지막으로 샐러드를 갖다 뿌린다.")) {
                        System.out.println((pork_bbq.get(3)));
                    }
                    System.out.println("요리 참 쉽지요~~"); // food == 3 종료

                } else if (food == 4) {
                    ArrayList beef_bbq = new ArrayList();//재료를 0~4번 인덱스에 내용 추가
                    System.out.println("소고기를 구워먹어야겠다. 재료가 뭐뭐 있더라?");
                    System.out.println("1. 소고기 2. 소금 3. 후추 4. 아스파라거스 5. 마늘");
                    System.out.println("소고기를 조리하겠습니다.");
                    beef_bbq.add(0, "소고기를 절반으로 짤라 놓는다.");
                    beef_bbq.add(1, "소고기에 소금을 뿌린다.");
                    beef_bbq.add(2, "소고기에 후추를 뿌린다.");
                    beef_bbq.add(3, "건강용으로 아스파라거스 뿌린다.");
                    beef_bbq.add(4, "아무도 접근하지 못하도록 마늘을 뿌린다.");

                    if (beef_bbq.contains("소고기를 절반으로 짤라 놓는다.")) {
                        System.out.println(beef_bbq.get(0));
                    } else if (beef_bbq.contains("소고기에 소금을 뿌린다.")) {
                        System.out.println(beef_bbq.get(1));
                    } else if (beef_bbq.contains("소고기에 후추를 뿌린다.")) {
                        System.out.println(beef_bbq.get(2));
                    } else if (beef_bbq.contains("건강용으로 아스파라거스 뿌린다.")) {
                        System.out.println(beef_bbq.get(3));
                    } else if (beef_bbq.contains("아무도 접근하지 못하도록 마늘을 뿌린다.")) {
                        System.out.println(beef_bbq.get(4));
                    } else {
                        System.out.println("요리하기 귀찮은데 굶어야겠다.");
                    }
                }
                System.out.println("밥도 먹었겠다 유튜브 시청할까 아님 그냥 잘까?");
                System.out.println("1.시청한다 2.잔다");
                int sleep = sc.nextInt();
                if (sleep == 1) {
                    System.out.println("유퀴즈나 봐야겠다.");
                    return;
                } else if (sleep == 2) {
                    System.out.println("오늘 하루 종료~~");
                    return;
                } else {
                    System.out.println("끝났어요");
                    return;
                }//# chapter 1-1 종료

            } else if (study == 2) {
                System.out.println("귀찮지만 카페에 가야겠다.");
                System.out.println("1.다독다독 2.ediya 3.starbucks 중 어느 곳에 갈까?");
                int place = sc.nextInt();
                if (place == 1) {
                    System.out.println("다독다독에서 공부해야겠다.");
                    System.out.println("(다독다독으로 이동 중 정체 모를 행인이 접근한다.)");
                    System.out.println("사이비: 대학생이세요?");
                    System.out.println("대답 OR 무시 둘 중 하나를 입력하세요.");
                    String answer = sc.next();
                    if (answer.equals("대답")) {
                        System.out.println("나: 아니요");
                        System.out.println("사이비: 잠깐 대화 가능하실까요?");
                        System.out.println("나: 바빠요 ");
                        System.out.println("(도서관 도착)오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else if (answer.equals("무시")) {
                        System.out.println("사이비: 선해보이세요 잠깐 시간 괜찮으실까요?");
                        System.out.println("나: 상대방을 째려보고 다독다독으로 이동");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else {
                        System.out.println("new jeans의 hype boy요");
                    }
                } else if (place == 2) {
                    System.out.println("ediya에서 공부해야겠다.");
                    System.out.println("1.콤부차 2.녹차 3.딸기 쥬스 중 어떤 게 좋을까?");
                    int dissert = sc.nextInt();
                    if (dissert == 1) {
                        System.out.println("콤부차 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else if (dissert == 2) {
                        System.out.println("녹차 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else if (dissert == 3) {
                        System.out.println("딸기 쥬스 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else {
                        System.out.println("안 먹어?");
                    }
                } else if (place == 3) {
                    System.out.println("starbucks에서 공부해야겠다.");
                    System.out.println("1.녹차 2.망고 쥬스 3.오렌지 쥬스");
                    int dissert = sc.nextInt();
                    if (dissert == 1) {
                        System.out.println("녹차 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else if (dissert == 2) {
                        System.out.println("망고 쥬스 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else if (dissert == 3) {
                        System.out.println("오렌지 쥬스 주문해야겠다.");
                        System.out.println("오늘 블로그 작성해야 되는게 뭐더라?");
                        System.out.println("1.git을 이용한 문서 관리 방법 2.git branch 3.github token 생성 4.git에서 사용하는 명령어 정리");
                        int write = sc.nextInt();
                        if (write == 1) {
                            System.out.println("git에서 작업 트리, 스테이지, 저장소 3단계를 통해 문서 관리하는 방법에 대해 작성해야지");
                        } else if (write == 2) {
                            System.out.println("git commit을 생성하고 브랜치 생성하는 방법에 대해 작성해야지");
                        } else if (write == 3) {
                            System.out.println("git push할 때 필요한 토큰 생성에 대해 작성해야지");
                        } else if (write == 4) {
                            System.out.println("그동안 git에서 사용했던 명령어를 정리해야지");
                        } else {
                            System.out.println("프로그램이 종료되었습니다.");
                            return;
                        }
                    } else {
                        System.out.println("안 먹어?");
                    }
                }
            }//study==2 else 문
            else {
                System.out.println("프로그램이 종료되었습니다.");
                return;
            }
            System.out.println("(카페에서 공부를 마치고 집으로 귀가한다.)");
            System.out.println("아빠: 도시락 정식 사놨으니까 먹어");
            System.out.println("1.먹는다 2.다른 음식을 먹는다");
            int deliver = sc.nextInt();
            if (deliver == 1) {
                System.out.println("네 먹을께요");
            } else if (deliver == 2) {
                System.out.println("다른 음식 먹을께요");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

            System.out.println("밥을 다 먹은 후 샤워를 한다.");
            System.out.println("화장품이나 바르고 자야겠다.");
            System.out.println("어떤 걸 바를까?");
            System.out.println("1.all in one 2.mask pack 3.로션");
            int cosmetics = sc.nextInt();
            if (cosmetics == 1) {
                System.out.println("귀찮을 때는 all in one 바르면 끝");

            } else if (cosmetics == 2) {
                System.out.println("mask pack 붙이고 자야겠다.");
            } else if (cosmetics == 3) {
                System.out.println("로션 후딱 바르고 자야겠다.");
            } else {
                System.out.println("잘못 입력했어요.");
                return;
            }
            //#1 chapter 종료
        }else if (취미활동_선택 == 2) {
                System.out.println("30분 뒤에 일어나자");
                System.out.println("후~~ 조금 피곤이 풀리네");
                System.out.println("오늘의 옷 스타일은 어떻게 하면 좋을까?");
                System.out.println("--------------상의-----------------");
                System.out.println("1. 머슬핏 반팔 티셔츠 2. 오버핏 반팔 티셔츠 3. 나시");
                int upper = sc.nextInt();
                System.out.println("--------------하의-----------------");
                System.out.println("4. 벌룬핏 팬츠 5. 벌룬핏 반바지 6. 트레이닝 반바지");
                int pants = sc.nextInt();
                if (upper == 1 && pants == 4) {// 오늘의 착장
                    System.out.println("머슬핏 반팔 티셔츠와 벌룬핏 팬츠를 선택하셨습니다.");
                } else if (upper == 1 && pants == 5) {
                    System.out.println("머슬핏 반팔 티셔츠와 벌룬핏 반바지를 선택하셨습니다.");
                } else if (upper == 1 && pants == 6) {
                    System.out.println("머슬핏 반팔 티셔츠와 트레이닝 반바지를 선택하셨습니다.");
                } else if (upper == 2 && pants == 4) {
                    System.out.println("오버핏 반팔 티셔츠와 벌룬핏 팬츠를 선택하셨습니다.");
                } else if (upper == 2 && pants == 5) {
                    System.out.println("오버핏 반팔 티셔츠와 벌룬핏 반바지를 선택하셨습니다.");
                } else if (upper == 2 && pants == 6) {
                    System.out.println("오버핏 반팔 티셔츠와 트레이닝 반바지를 선택하셨습니다.");
                } else if (upper == 3 && pants == 4) {
                    System.out.println("나시와 벌룬핏 팬츠를 선택하셨습니다.");
                } else if (upper == 3 && pants == 5) {
                    System.out.println("나시와 벌룬핏 반바지를 선택하셨습니다.");
                } else if (upper == 3 && pants == 6) {
                    System.out.println("나시와 트레이닝 반바지를 선택하셨습니다.");
                } else {
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
                    System.out.println("--------------상의-----------------");
                    System.out.println("1. 머슬핏 반팔 티셔츠 2. 오버핏 반팔 티셔츠 3. 나시");
                    upper = sc.nextInt();
                    System.out.println("--------------하의-----------------");
                    System.out.println("4. 벌룬핏 팬츠 5. 벌룬핏 반바지 6. 트레이닝 반바지");
                    pants = sc.nextInt();
                    if (upper == 1 && pants == 4) {// 오늘의 착장
                        System.out.println("머슬핏 반팔 티셔츠와 벌룬핏 팬츠를 선택하셨습니다.");
                    } else if (upper == 1 && pants == 5) {
                        System.out.println("머슬핏 반팔 티셔츠와 벌룬핏 반바지를 선택하셨습니다.");
                    } else if (upper == 1 && pants == 6) {
                        System.out.println("머슬핏 반팔 티셔츠와 트레이닝 반바지를 선택하셨습니다.");
                    } else if (upper == 2 && pants == 4) {
                        System.out.println("오버핏 반팔 티셔츠와 벌룬핏 팬츠를 선택하셨습니다.");
                    } else if (upper == 2 && pants == 5) {
                        System.out.println("오버핏 반팔 티셔츠와 벌룬핏 반바지를 선택하셨습니다.");
                    } else if (upper == 2 && pants == 6) {
                        System.out.println("오버핏 반팔 티셔츠와 트레이닝 반바지를 선택하셨습니다.");
                    } else if (upper == 3 && pants == 4) {
                        System.out.println("나시와 벌룬핏 팬츠를 선택하셨습니다.");
                    } else if (upper == 3 && pants == 5) {
                        System.out.println("나시와 벌룬핏 반바지를 선택하셨습니다.");
                    } else if (upper == 3 && pants == 6) {
                        System.out.println("나시와 트레이닝 반바지를 선택하셨습니다.");
                    } else {
                        System.out.println("잘 못 입력되어 프로그램을 종료합니다.");
                        return;
                    }
                }
                System.out.println("좋아 헬스장으로 이동하자 ");
                System.out.println("(헬스장으로 이동 중 cu가 보인다.)아 어떡하지 cu에서 게토레이를 먹을까 말까?");
                System.out.println("1. 게토레이를 산다 2. 안 산다를 선택해주세요");
                int drink = sc.nextInt();
                if (drink == 1) {
                    System.out.println("(꿀꺽꿀꺽)캬~ 게토레이 못 참지~~");
                } else {
                    System.out.println("그래 돈 굳혀야지 내가 먼 게토레이냐...");
                }
                System.out.println("8층을 누르고 헬스장 앞 회원증을 인식하는 기계에 휴대폰 어플에 찍힌 인증 코드를 갖다댄다");
                System.out.println("기계에서 인식하는 중 회원이면 true 아니면 false");
                boolean membership = sc.nextBoolean();
                if (membership == true) {
                    System.out.println("무분할로 오늘 운동 끝내야겠다.");
                    System.out.println("첫 종목으로 무엇을 할 지 선택해주세요");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int workout = sc.nextInt();
                    if (workout == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (workout == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (workout == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (workout == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (workout == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (workout == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (workout == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");

                    }
                    System.out.println("2번째 종목을 선택해주세요.");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int second = sc.nextInt();
                    if (second == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (second == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (second == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (second == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (second == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (second == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (second == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                    }
                    System.out.println("3번째 종목을 선택해주세요");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int third = sc.nextInt();
                    if (third == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (third == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (third == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (third == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (third == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (third == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (third == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                    }
                    System.out.println("4번째 종목을 선택해주세요.");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int forth = sc.nextInt();
                    if (forth == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (forth == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (forth == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (forth == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (forth == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (forth == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (forth == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                    }
                    System.out.println("5번째 종목을 선택해주세요.");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int five = sc.nextInt();
                    if (five == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (five == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (five == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (five == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (five == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (five == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (five == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                    }
                    System.out.println("6번째 종목을 선택해주세요.");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int six = sc.nextInt();
                    if (six == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (six == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (six == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (six == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (six == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (six == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (six == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                    }
                    System.out.println("일곱번째 종목을 선택해주세요.");
                    System.out.println("1.벤치프레스 2.오버헤드 프레스 3.스쿼드 4.데드리프트 5.덤벨 사레레 6.바벨컬 7.케이블 푸쉬 다운");
                    int seven = sc.nextInt();
                    if (seven == 1) {
                        System.out.println("1번 벤치프레스를 선택하셨습니다.");
                        System.out.println("음 가슴이 웅장해지는 시간이구먼");
                        System.out.println("벤치프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                            System.out.println("과연 무게를 들 수 있을까? 든다 true 못 든다 false를 입력해주세요");
                            boolean overcome = sc.nextBoolean();
                            if (overcome == true) {
                                System.out.println("들어!!! 이 자식아 (끄으응)성공");
                            } else {
                                System.out.println("들어!!! 이 자식아 (끄으응)실패 다음 기회에...");
                            }
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (seven == 2) {
                        System.out.println("2번 오버헤드프레스를 선택하셨습니다.");
                        System.out.println("코코넛 어깨 조아쒀");
                        System.out.println("오버헤드 프레스 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("다른 거 할까?");
                        }
                    } else if (seven == 3) {
                        System.out.println("3번 스쿼트를 선택하셨습니다.");
                        System.out.println("아 하기 싫어~~~");
                        System.out.println("스쿼트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                            System.out.println("마지막 세트 5회를 진행 중 1개를 남기고 한계가 온다.");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (seven == 4) {
                        System.out.println("4번 데드리프트를 선택하셨습니다.");
                        System.out.println("벌써부터 뇌에 산소가 부족해지는 느낌이다.");
                        System.out.println("데드리프트 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12 3.15~20 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (seven == 5) {
                        System.out.println("5번 덤벨 사레레를 선택하셨습니다.");
                        System.out.println("자극충 조아쒀");
                        System.out.println("사레레 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        } else {
                            System.out.println("아 다른거 할까?");
                        }
                    } else if (seven == 6) {
                        System.out.println("6번 바벨컬을 선택하셨습니다.");
                        System.out.println("팔 찢는 느낌으로다가 해보자고");
                        System.out.println("바벨컬 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else if (seven == 7) {
                        System.out.println("7번 케이블 푸쉬 다운을 선택하셨습니다.");
                        System.out.println("삼두 먹방 조아쒀");
                        System.out.println("케이블 푸쉬 다운 중량 대비 몇 회를 하면 좋을까?");
                        System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                        int reps = sc.nextInt();
                        if (reps == 1) {
                            System.out.println("6~8회를 선택하셨습니다.");
                            System.out.println("중량감 있게 4세트 가보자");
                        } else if (reps == 2) {
                            System.out.println("8~12회를 선택하셨습니다.");
                            System.out.println("역시 8~12회 국룰 근비대 횟수지");
                        } else if (reps == 3) {
                            System.out.println("15~20회를 선택하셨습니다.");
                            System.out.println("자극충은 15~20회지!");
                        } else if (reps == 4) {
                            System.out.println("50회를 선택하셨습니다.");
                            System.out.println("100회 아닌게 어디야 해보자고");
                        } else if (reps == 5) {
                            System.out.println("100회를 선택하셨습니다.");
                            System.out.println("침 질질 흘리겠구먼");
                        }
                    } else {
                        System.out.println("해당 종목을 원치 않을 경우 다른 종목으로 이동합니다.");
                        return;
                    }


                } else if (취미활동_선택 == 3) {




                }// chapter 3 끝
            }
        }
    }

}

*/
