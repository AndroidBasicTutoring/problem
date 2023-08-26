import java.util.Scanner;

public class imi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================취미 활동을 시작하겠습니다.=============================================================");
        System.out.println("다음 보기 중 취미활동을 선택해주세요.");
        System.out.println("1.헬스장으로 이동한다 2.집에서 운동을 한다. 3.해공공원에서 조깅을 한다. 4.유튜브를 시청한다.");
        int 취미활동_선택 = sc.nextInt();
        if (취미활동_선택 == 1) {//헬스장으로 이동을 선택했을 때 상황
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
            System.out.println("8층을 누르고 헬스장 앞 회원증을 인식하는 기계에 휴대폰 어플에 찍힌 인증 코드를 갖다댄다.");
            System.out.println("기계에서 인식하는 중 회원권 기간이 남았을 경우 true 아니면 false를 선택해주세요.");
            boolean 회원권 = sc.nextBoolean();//회원권 TRUE OR FALSE
            if (회원권) { // 회원권 == true일 때
                System.out.println("회원 인증이 완료되었습니다.");
                System.out.println("(문이 열립니다.)");
            } else {// 회원권이 false로 첫번째 종료
                System.out.println("회원권 기간 만료되었습니다.");
            }
            System.out.println("(회원복을 갈아입고)오늘은 어떤 부위를 하면 좋을까?");//한 부위만 운동 가능
            System.out.println("1.등 2. 가슴 3. 다리 4. 어깨 5. 팔");
            int 운동할_부위_선택 = sc.nextInt();//부위 입력받기
            if (운동할_부위_선택 == 1) {// 운동 부위가 등 일때
                System.out.println("등 운동을 해야겠다.");
                System.out.println("1.렛풀다운 2.데드리프트 3.바벨로우");
                System.out.println("어떤 것을 먼저 하면 좋을까?");
                int 등_운동_순서 = sc.nextInt();//등 운동 종목 입력받기
                if (등_운동_순서 == 1) {
                    System.out.println("렛풀다운을 해야겠다.");
                    System.out.println("(렛풀다운을 하러 이동하다가 다른 사람이 하고 있는 것을 목격한다.) 당신의 선택은?");
                    System.out.println("1.다른 종목을 한다. 2. 같이 할 수 있는지 물어본다. 3.끝날 때까지 기다린다.");
                    int 렛풀다운_사람이_사용하고_있는_경우 = sc.nextInt();//자리가 없을 때
                    if (렛풀다운_사람이_사용하고_있는_경우 == 1) {
                        System.out.println("다른 걸로 대체해야겠다.");
                        System.out.println("(눈에 보이는 것)1.암풀 다운 2.케이블 로우가 보인다.어떤 걸 먼저할까?");
                        int 종목변경_순서결정 = sc.nextInt();
                        if (종목변경_순서결정 == 1) {
                            System.out.println("암풀 다운을 해야겠다.");

                        } else if (종목변경_순서결정 == 2) {
                            System.out.println("케이블 로우를 해야겠다.");
                            System.out.println("케이블 로우는 중량 대비 몇 회를 하면 좋을까?");
                            System.out.println("1. 6~8회  2. 8~12회 3.15~20회 4.50회 5.100회");
                            System.out.println("(자리가 안 나오려나?) 암풀 다운을 해야겠다.");
                            System.out.println("(렛풀다운 자리가 생긴다면)1.한다 2.안 한다");
                            int 자리가_생겼을_경우 = sc.nextInt();//자리가 공석이 된다는 가정을 입력받기
                            if (자리가_생겼을_경우 == 1) {
                                System.out.println("아쉬우니까 하고 끝내야겠다.");//등 운동 세 번째 이야기 끝
                            } else if (자리가_생겼을_경우 == 2) {//자리가 없는 경우==2
                                System.out.println("아쉽지만 오늘은 이만");//등 운동 네 번째 이야기 끝
                            }
                        } else {
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (렛풀다운_사람이_사용하고_있는_경우 == 2) {
                        System.out.println("혹시 같이 할 수 있을까요?");
                        System.out.println("???:1.승낙 2.거부");
                        int 공동사용_제안했을_경우 = sc.nextInt();//렛풀다운 공동사용 요청 입력받기
                        if (공동사용_제안했을_경우 == 1) {
                            System.out.println("???: 그래요 같이 하시죠.");
                            System.out.println("???: 이것도 인연인데 같이 파트너 운동하실래요?");
                            System.out.println("나: 좋습니다. 어떻게 제 운동 방식으로 진행하실래요?");
                            System.out.println("???: 다른 것을 하면 어떨까요?");
                            System.out.println("나: 1.받아들인다. 2.개인 운동을 한다.");
                            int 상대방_운동루틴 = sc.nextInt();//상대방의 운동 루틴을 받아들일지 입력받기
                            if (상대방_운동루틴 == 1) {
                                System.out.println("나: 알겠습니다. 어떤 운동를 할까요?");
                                System.out.println("???: 1.원암 덤벨로우 2.티바로우 어떤 걸 먼저 하실래요?");
                                int 상대방_운동루틴_받아들였을_때 = sc.nextInt();//상대방 운동 방식을 받아들인 상황 입력받기
                                if (상대방_운동루틴_받아들였을_때 == 1) {
                                    System.out.println("나: 원암 덤벨로우 먼저 하시죠.");
                                    System.out.println("???: 좋습니다. 덤벨로우하러 이동하시죠.");
                                    System.out.println("나: 티바로우 하고 저는 끝내겠습니다.");
                                    System.out.println("???: 네 알겠습니다.");//등 운동 다섯 번째 이야기 끝
                                } else if (상대방_운동루틴_받아들였을_때 == 2) {
                                    System.out.println("나: 티바로우 먼저 하시죠.");
                                    System.out.println("???: 좋습니다. 티바로우하러 이동하시죠.");
                                    System.out.println("나: 원암 덤벨로우 하고 저는 끝내겠습니다.");
                                    System.out.println("???: 네 알겠습니다.");//등 운동 여섯 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (상대방_운동루틴 == 2) {
                                System.out.println("나: 죄송해요.저는 개인 운동을 하는게 좋겠네요 수고하세요.");
                                System.out.println("???: 네 수고하세요.");
                                System.out.println("어떤 운동을 먼저 하면 좋을까?");
                                System.out.println("2.데드리프트 3.바벨로우");
                                int 렛풀다운을_제외한_등_운동_순서 = sc.nextInt();
                                if (렛풀다운을_제외한_등_운동_순서 == 2) {
                                    System.out.println("데드리프트 해야겠다.");
                                    System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 일곱 번째 이야기 끝
                                } else if (렛풀다운을_제외한_등_운동_순서 == 3) {
                                    System.out.println("바벨로우를 해야겠다.");
                                    System.out.println("마무리로 데드리프트를 해야겠다.");//등 운동 여덟 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (공동사용_제안했을_경우 == 2) {
                                System.out.println("???: 미안해요. 부담스러워서 혼자하고 싶네요...");
                                System.out.println("나: 네 알겠습니다. 다른 운동을 하러 이동한다.");
                                System.out.println("어떤 운동을 하면 좋을까?");
                                System.out.println("2.데드리프트 3.바벨로우");
                                int 공동사용_끝난후_렛풀다운을_제외한_등_운동_순서 = sc.nextInt();
                                if (공동사용_끝난후_렛풀다운을_제외한_등_운동_순서 == 2) {
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 아홉 번째 이야기 끝
                                } else if (공동사용_끝난후_렛풀다운을_제외한_등_운동_순서 == 3) {
                                    System.out.println("바벨로우를 해야겠다.");
                                    System.out.println("마무리로 데드리프트를 해야겠다.");//등 운동 열번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }

                            }

                        }
                    } else if (렛풀다운_사람이_사용하고_있는_경우 == 3) {
                        System.out.println("끝날 때까지 기다려야겠다.");
                        System.out.println("(자리가 생긴다면) 1.한다. 2.안 한다.");
                        int 기다렸다가_자리가_생겼을_때 = sc.nextInt();
                        if (기다렸다가_자리가_생겼을_때 == 1) {
                            System.out.println("자리 생기면 어떤 운동을 진행하면 좋을까?");
                            System.out.println("1.렛풀다운 2.데드리프트 3.바벨로우");
                            int 등_운동_순서3 = sc.nextInt();
                            if (등_운동_순서3 == 1) {// 공석-자리부족 등 순서 1
                                System.out.println("렛풀다운을 해야겠다.");
                                System.out.println("2.데드리프트 3.바벨로우 중 어떤 것을 진행하면 좋을까?");
                                int 렛풀다운을_제외한_등_운동_순서3 = sc.nextInt();//등 순서5 렛풀다운을 제외하고 순서대로
                                if (렛풀다운을_제외한_등_운동_순서3 == 2) {
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 열한 번째 이야기 끝
                                } else if (렛풀다운을_제외한_등_운동_순서3 == 3) {
                                    System.out.println("바벨로우를 해야겠다.");
                                    System.out.println("마무리로 데드리프트를 해야겠다.");//등 운동 열두 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (기다렸다가_자리가_생겼을_때 == 2) {//공석-자리부족 등순서 2
                                System.out.println("데드리프트를 해야겠다.");
                                System.out.println("1.렛풀다운 3.바벨로우 중 어떤 것을 진행하면 좋을까?");
                                int 데드리프트를_제외한_등_운동_순서 = sc.nextInt();//등 순서6 데드리프트를 제외하고 순서대로
                                if (데드리프트를_제외한_등_운동_순서 == 1) {
                                    System.out.println("렛풀다운을 해야겠다.");
                                    System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 열세 번째 이야기 끝
                                } else if (데드리프트를_제외한_등_운동_순서 == 3) {
                                    System.out.println("바벨로우를 해야겠다.");
                                    System.out.println("마무리로 렛풀다운을 해야겠다.");//등 운동 열네 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (기다렸다가_자리가_생겼을_때 == 3) {//공석-자리부족 등순서 3
                                System.out.println("바벨로우를 해야겠다.");
                                System.out.println("1.렛풀다운 2.데드리프트 중 어떤 것을 진행하면 좋을까?");
                                int 렛풀다운을_제외한_등_운동_순서4 = sc.nextInt();
                                if (렛풀다운을_제외한_등_운동_순서4 == 1) {
                                    System.out.println("렛풀다운을 해야겠다.");
                                    System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 열네 번째 이야기 끝
                                } else if (렛풀다운을_제외한_등_운동_순서4 == 2) {
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("마무리로 렛풀다운을 해야겠다.");//등 운동 열다섯 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            }
                        } else if (기다렸다가_자리가_생겼을_때 == 2) {//자리가 없는 경우
                            System.out.println("오늘은 안 되겠다 다음에 운동해야겠다.");//등 운동 열여섯 번째 이야기 끝
                        } else {
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }//자리가_생겼을_때2 == 3 종료

                    } else if (등_운동_순서 == 2) {//등 운동 순서 중 데드리프트를 먼저한다고 했을 때
                        System.out.println("데드리프트를 해야겠다.");
                        System.out.println("(데드리프트 도중 허리에 느낌이 좋지 않다...)계속 진행하시겠습니까?");
                        System.out.println("1.진행한다. 2.그만한다.");
                        int 부상 = sc.nextInt();//등운동- 데드리프트 - 부상 입력받기
                        if (부상 == 1) {
                            System.out.println("느낌이 좋지 않지만 계속 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 무엇을 하면 좋을까?");
                            System.out.println("1.렛풀다운 3.바벨로우 중 어떤 것을 진행하면 좋을까?");
                            int 데드리프트를_제외한_운동진행 = sc.nextInt();
                            if (데드리프트를_제외한_운동진행 == 1) {
                                System.out.println("렛풀다운을 해야겠다.");
                                System.out.println("마무리로 바벨로우를 해야겠다.");//등 운동 열일곱 번째 이야기 끝
                            } else if (데드리프트를_제외한_운동진행 == 3) {
                                System.out.println("바벨로우를 해야겠다.");
                                System.out.println("마무리는 렛풀다운을 해야겠다.");
                                System.out.println("어...기계가 고장났다.다른 운동해야 할까?");
                                System.out.println("1.계속 진행한다. 2.그만한다.");
                                int 기계고장 = sc.nextInt();//기계 고장으로 인해 다른 운동 진행의사 입력받기
                                if (기계고장 == 1) {
                                    System.out.println("다른 운동으로 1.원암 풀다운 2.인버티드 로우 중 어떤 것을 진행하면 좋을까?");
                                    int 종목변경 = sc.nextInt();//등운동-데드리프트-종목 변경 1.원암 풀다운 2.인버티드 로우
                                    if (종목변경 == 1) {
                                        System.out.println("원암 풀다운을 해야겠다.");
                                        System.out.println("마무리는 인버티드 로우를 해야겠다.");//등 운동 열여덟 번째 이야기 끝
                                    } else if (종목변경 == 2) {
                                        System.out.println("인버티드 로우를 해야겠다.");
                                        System.out.println("마무리는 원암 풀다운을 해야겠다.");//등 운동 스물 번째 이야기 끝
                                    } else {
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }
                                } else if (기계고장 == 2) {
                                    System.out.println("오늘 운동은 여기까지 해야겠다.");//등 운동 스물한 번째 이야기 끝
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }// 기계 고장 내용 끝
                            }
                        } else if (부상 == 2) {
                            System.out.println("컨디션이 안 좋아서 운동은 여기까지 해야겠다.");//등 운동 스물두 번째 이야기 끝
                        } else {
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (등_운동_순서 == 3) {//바벨로우를 먼저한다고 했을 때
                        System.out.println("바벨로우를 해야겠다.");
                        System.out.println("???: 자세 교정이 필요해보이시네요. 알려드릴까요?");
                        System.out.println("1.티칭을 받는다. 2.받지 않는다.");
                        int 티칭 = sc.nextInt();//티칭 수락/거절
                        if (티칭 == 1) {
                            System.out.println("아 네 그럼 한 번 시범한 번 보여주시겠어요?");
                            System.out.println("(시범 진행 중 자세가)");
                            System.out.println("1.가동 범위를 짧게 운동한다. 2.정자세로 한다. 3.반동을 써서 운동을 한다.");
                            int 운동_시범 = sc.nextInt();
                            if (운동_시범 == 1) {
                                System.out.println("잘 배웠습니다...빨리 다음 운동하러 가야겠다.");
                                System.out.println("1.렛풀다운 2.데드리프트 중 어떤 것을 진행하면 좋을까?");
                                int 개인운동 = sc.nextInt();//등순서==3-> 티칭 1 -> 시범 1
                                if (개인운동 == 1) {
                                    System.out.println("렛풀다운을 해야겠다.");
                                    System.out.println("마무리는 데드리프트를 해야겠다.");//등 운동 스물세 번째 이야기 끝
                                } else if (개인운동 == 2) {//상대방 운동 자세가 올바른 경우
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("???: 데드리프트 하실려고? 제가 알려드릴께요.");
                                    System.out.println("1.티칭 받는다. 2.거부한다.");
                                    int 티칭_권유 = sc.nextInt();//
                                    if (티칭_권유 == 1) {
                                        System.out.println("아...네 감사합니다.");
                                        System.out.println("렛풀다운을 마지막으로 해야겠다.");//등 운동 스물네 번째 이야기 끝
                                    } else if (티칭_권유 == 2) {
                                        System.out.println("나: 감사하지만 혼자 해보겠습니다.");
                                        System.out.println("렛풀다운을 빨리 끝내야겠다.");//등 운동 스물 다섯 번째 이야기 끝
                                    } else {
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }
                                }
                            } else if (운동_시범 == 2) {
                                System.out.println("나: 자세가 좋으시네요. 가르쳐주세요.");
                                System.out.println("(티칭이 끝난 후)다음에는 어떤 운동을 하면 좋을까?");
                                System.out.println("1.렛풀다운 2.데드리프트");
                                int 배운후_개인운동 = sc.nextInt();//등순서==3-> 티칭 1 -> 시범 == 2
                                if (배운후_개인운동 == 1) {
                                    System.out.println("렛풀다운을 해야겠다.");
                                    System.out.println("마무리는 데드리프트를 해야겠다.");//등 운동 스물 여섯 번째 이야기 끝
                                } else if (배운후_개인운동 == 2) {
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("렛풀다운을 해야겠다.");
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (운동_시범 == 3) {
                                System.out.println("(반동이 심하신 편이네...빨리 넘어가야겠다.)");
                                System.out.println("(운동이 끝난 후)다음에는 어떤 운동을 하면 좋을까?");
                                System.out.println("1.렛풀다운 2.데드리프트");
                                int 배움_끝난후_개인운동 = sc.nextInt();//등순서==3-> 티칭 1 -> 시범 == 3
                                if (배움_끝난후_개인운동 == 1) {
                                    System.out.println("렛풀다운을 해야겠다.");
                                    System.out.println("마무리는 데드리프트를 해야겠다.");
                                } else if (배움_끝난후_개인운동 == 2) {
                                    System.out.println("데드리프트를 해야겠다.");
                                    System.out.println("마무리는 렛풀다운을 해야겠다.");
                                } else {
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }//등 운동 스물 여섯 번째 이야기 끝
                            }
                        } else if (티칭 == 2) {
                            System.out.println("나: 스스로 해보겠습니다.");
                            System.out.println("(운동이 끝난 후)다음에는 어떤 운동을 하면 좋을까?");
                            System.out.println("1.렛풀다운 2.데드리프트");
                            int 거절후_등운동순서 = sc.nextInt();//시범 ==3 티칭 ==2 등순서
                            if (거절후_등운동순서 == 1) {
                                System.out.println("렛풀다운을 해야겠다.");
                                System.out.println("마무리는 데드리프트를 해야겠다.");
                            } else if (거절후_등운동순서 == 2) {
                                System.out.println("데드리프트를 해야겠다.");
                                System.out.println("마무리는 렛풀다운을 해야겠다.");
                            } else {
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        }
                    } else {
                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                    }
                }
            } else if (운동할_부위_선택 == 2) {//운동 부위 가슴을 선택했을 경우
                System.out.println("가슴 운동을 해야겠다.");
                System.out.println("1.벤치프레스 2.인클라인 체스트 프레스 3.덤벨 플라이");
                System.out.println("어떤 것을 먼저하면 좋을까?");
                int 가슴_운동_순서 = sc.nextInt();
                if (가슴_운동_순서 == 1) {
                    System.out.println("벤치프레스를 해야겠다.");
                    System.out.println("운동하려는 도중 다음과 같은 상황 발생");
                    System.out.println("1.바벨을 함부로 내려놓는 경우 2.휴식 사이에 자리를 차지한 경우 3.티칭을 요청한 경우");
                    int 불편한_상황발생 = sc.nextInt();
                    if (불편한_상황발생 == 1) {
                        System.out.println("(쿵쿵쿵)바벨의 소리가 들려온다.");
                        System.out.println("아 뭐라고 해야하나?");
                        System.out.println("1.무시한다 2.대화를 나눈다.");
                        int 대화 = sc.nextInt();
                        if (대화 == 1) {
                            System.out.println("꾹 참고 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음 중 어떤 것을 하면 좋을까?");
                            System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이");
                            가슴_운동_순서 = sc.nextInt();// 운동부위 == 2 ->상황 발생->대화 ==1
                            if (가슴_운동_순서 == 2) {
                                System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                System.out.println("마지막으로 덤벨 플라이를 해야겠다.");
                            } else if (가슴_운동_순서 == 3) {
                                System.out.println("덤벨 플라이를 해야겠다.");
                                System.out.println("(운동 도중)운동을 변형해서 해볼까?");
                                System.out.println("1.기본 자세를 한다. 2.변형한다.");
                                int 자세변형 = sc.nextInt();//자세 변형 입력받기
                                if (자세변형 == 1) {
                                    System.out.println("기본 자세로 해야겠다.");
                                    System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                } else if (자세변형 == 2) {
                                    System.out.println("변형해서 프레스처럼 해야겠다.");
                                    System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                } else {//#1 가슴운동 끝
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (대화 == 2) {
                                System.out.println("나: 죄송한데 바벨을 살살 내려놓아 주실 수 있을까요?");
                                System.out.println("???: 힘들어서 그런데 그럴 수도 있죠.");
                                System.out.println("(말이 안 통하는 상태)1.대화를 이어간다. 2.고객 소리함에 제보한다.");
                                int 소통 = sc.nextInt();
                                if (소통 == 1) {
                                    System.out.println("나: 슬링랙이라도 사용해주시면 감사하겠습니다.");
                                    System.out.println("상대방의 반응은?");
                                    System.out.println("1.수긍한다. 2.자기 주장만 내세운다.");
                                    int 상대방_반응 = sc.nextInt();
                                    if (상대방_반응 == 1) {
                                        System.out.println("???: 일단은 잘 알겠습니다. 죄송합니다.");
                                        System.out.println("나: 아닙니다. 이해해주셔서 감사합니다.");
                                        System.out.println("다음 운동을 위해 어떤 것을 하면 좋을까?");
                                        System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이");
                                        int 벤치프레스_운동끝_다음_순서 = sc.nextInt();//부위->대화->순서
                                        if (벤치프레스_운동끝_다음_순서 == 2) {
                                            System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                            System.out.println("마무리는 덤벨 플라이를 해야겠다.");
                                        } else if (벤치프레스_운동끝_다음_순서 == 3) {
                                            System.out.println("덤벨 플라이를 해야겠다.");
                                            System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                        } else {//#2 가슴운동 끝
                                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                        }
                                    } else if (소통 == 2) {//상대방이 자기 주장만 내세운 경우
                                        System.out.println("???: 새벽에 어차피 아래에 없을 텐데 제가 왜 그래야되죠? ");
                                        System.out.println("(후 그냥 넘어가야겠다.)");
                                    } else {//#3 가슴운동 끝
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }

                                } else if (소통 == 2) {
                                    System.out.println("고객 소리함에 제보해야겠다.");
                                    System.out.println("(운동이 끝난 후)다음 운동으로 어떤 걸 하면 좋을까?");
                                    System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이");
                                    int 소통x_가슴운동_다음순서 = sc.nextInt();//부위->대화->최후통첩->순서
                                    if (소통x_가슴운동_다음순서 == 2) {
                                        System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                        System.out.println("마무리는 덤벨 플라이를 해야겠다.");
                                    } else if (소통x_가슴운동_다음순서 == 3) {
                                        System.out.println("덤벨 플라이를 해야겠다.");
                                        System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                    } else {//#4 가슴운동 끝
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }
                                }
                            }
                        }
                    } else if (불편한_상황발생 == 2) {
                        System.out.println("(내 자리인데....)1.애기한다. 2.다음할 운동을 한다.");
                        int 자리를_빼앗긴_경우 = sc.nextInt();
                        if (자리를_빼앗긴_경우 == 1) {
                            System.out.println("나: 실례지만 저 아직 사용중입니다만");
                            System.out.println("???:(반응)1.양보한다. 2.무시하고 사용한다.");
                            int 상대방_반응 = sc.nextInt();//상대방 반응 선택
                            if (상대방_반응 == 1) {
                                System.out.println("???:아 네 알겠습니다. 사용하세요.");
                                System.out.println("나: 네 감사합니다.");
                                System.out.println("어떤 걸 하면 좋을까?");
                                System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이");
                                int 운동후_다음_가슴_운동_순서 = sc.nextInt();//상황발생 == 2 -> 자리 싸움 == 1
                                if (운동후_다음_가슴_운동_순서 == 2) {
                                    System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                    System.out.println("마무리는 덤벨 플라이를 해야겠다.");
                                } else if (운동후_다음_가슴_운동_순서 == 3) {
                                    System.out.println("덤벨 플라이를 해야겠다.");
                                    System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                } else {//#5 가슴운동 끝
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (자리를_빼앗긴_경우 == 2) {//무시하고 운동울 진행한 경우
                                System.out.println("할 수 없다 인클라인 덤벨 프레스로 종목을 변경해야겠다.");
                                System.out.println("어떤 걸 하면 좋을까?");
                                System.out.println("1.인클라인 덤벨 프레스 2.인클라인 체스트 프레스 3.덤벨 플라이");
                                int 종목변경_후_가슴_운동순서 = sc.nextInt();
                                if (종목변경_후_가슴_운동순서 == 1) {
                                    System.out.println("인클라인 덤벨 프레스를 해야겠다.");
                                    System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이 둘 중 어떤 것을 먼저할까?");
                                    int 종목변경_후_가슴_운동순서2 = sc.nextInt();//자리싸움 == 1 -> 관용 == 2 벤치프레스 제외하고
                                    if (종목변경_후_가슴_운동순서2 == 2) {
                                        System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                        System.out.println("마무리는 덤벨 플라이를 해야겠다.");
                                    } else if (종목변경_후_가슴_운동순서2 == 3) {
                                        System.out.println("덤벨 플라이를 해야겠다.");
                                        System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                                    } else {
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }
                                }
                            } else {
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }//#6 가슴운동 끝
                        }
                    } else if (불편한_상황발생 == 3) {
                        System.out.println("???: 혹시 자세를 알으켜 주실 수 있나요?");
                        System.out.println("나: 1.가르쳐 드린다. 2.거부한다.");
                        int 교습 = sc.nextInt();
                        if (교습 == 1) {
                            System.out.println("네 알겠습니다. 동작한 번 해보시겠어요?");
                            System.out.println("???: 네 알겠습니다. (자세 빈봉도 힘들어함)");
                            System.out.println("전거근과 코어에 힘주는 방법을 터득하면 좋을 것 같아요.");
                            System.out.println("(티칭이 끝난 후)다음 운동 순서를 어떻게 하면 좋을까?");
                            System.out.println("2.인클라인 체스트 프레스 3.덤벨 플라이");
                            int 티칭_끝난후_가슴운동_순서 = sc.nextInt();//상황발생 == 3 -> 교습
                            if (티칭_끝난후_가슴운동_순서 == 2) {
                                System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                System.out.println("???: 다시 한 번 봐주실 수 있을까요?");
                                System.out.println("1.한번 더 봐드린다. 2. 개인 운동을 한다.");
                                int 교습2 = sc.nextInt();
                                if (교습2 == 1) {
                                    System.out.println("나: 네 알겠습니다...");
                                    System.out.println("???: (동작 실행 중)");
                                    System.out.println("가슴의 정지점은 상완에 붙어있기 때문에 가슴과 팔을 붙인다는 느낌으로 하시면 됩니다.");
                                    System.out.println("(티칭이 끝난 후)덤벨 플라이를 마지막으로 해야겠다.");
                                } else if (교습2 == 2) {
                                    System.out.println("나: 죄송합니다. 저도 약속있어서");
                                    System.out.println("???: 네 알겠습니다.");
                                    System.out.println("덤벨 플라이를 마지막으로 해야겠다.");
                                } else {//#7 가슴운동 끝
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (티칭_끝난후_가슴운동_순서 == 3) {
                                System.out.println("덤벨 플라이를 해야겠다.");
                                System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                            } else {//#8 가슴운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (교습 == 2) {//티칭을 거부했을 때
                            System.out.println("나: 죄송해요. 저도 빨리 집에 가야돼서 힘들 것 같습니다.");
                            System.out.println("???: 네 알겠습니다.");
                        }
                    } else {//#9 가슴운동 끝
                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                    }
                } else if (가슴_운동_순서 == 2) {//인클라인 체스트 프레스를 먼저 운동한다고 했을 때
                    System.out.println("인클라인 체스트 프레스를 해야겠다.");
                    System.out.println("(운동이 끝난 후 뭔가 아쉽다.)종목을 전부 변경해서 해야겠다.");
                    System.out.println("1.변경한다 2.그대로 한다.");
                    int 종목변경 = sc.nextInt();
                    if (종목변경 == 1) {
                        System.out.println("어떤 걸 하면 좋을까?");
                        System.out.println("1.디클라인 벤치 프레스 2.케이블 크로스 오버");
                        int 가슴순서2 = sc.nextInt();//종목 전부 변경해서 입력받기
                        if (가슴순서2 == 1) {
                            System.out.println("디클라인 벤치 프레스를 해야겠다.");
                            System.out.println("마무리는 케이블 크로스 오버를 해야겠다.");
                        } else if (가슴순서2 == 2) {
                            System.out.println("케이블 크로스 오버를 해야겠다.");
                            System.out.println("마무리는 디클라인 벤치 프레스를 해야겠다.");
                        } else {//#10 가슴운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (종목변경 == 2) {
                        System.out.println("하던 루틴으로 해야겠다.");
                        System.out.println("어떤 걸 하면 좋을까?");
                        System.out.println("1.벤치 프레스 2.인클라인 체스트 프레스");
                        int 원래하던_가슴_운동순서 = sc.nextInt();//가슴순서 == 2 -> 종목 변경 == 2
                        if (원래하던_가슴_운동순서 == 1) {
                            System.out.println("벤치 프레스를 해야겠다.");
                            System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                        } else if (원래하던_가슴_운동순서 == 2) {
                            System.out.println("인클라인 체스트 프레스를 해야겠다.");
                            System.out.println("마무리는 벤치 프레스를 해야겠다.");
                        } else {//#11 가슴운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else {//가슴_운동_순서 == 2 가슴운동 끝
                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                    }
                } else if (가슴_운동_순서 == 3) {
                    System.out.println("덤벨 플라이를 해야겠다.");
                    System.out.println("(4KG로 운동 중 원하는 6KG 덤벨이 보이지 않는다.)다른 것을 추가해야될까?");
                    System.out.println("1. 종목을 추가한다. 2.추가하지 않는다.");
                    int 종목추가 = sc.nextInt();
                    if (종목추가 == 1) {
                        System.out.println("펙덱 플라이를 추가해야겠다.");
                        System.out.println("어떤 걸 하면 좋을까?");
                        System.out.println("1.벤치 프레스 2.인클라인 체스트 프레스 3.펙덱 플라이");
                        int 가슴운동_종목_추가_후_운동순서 = sc.nextInt();//종목 추가
                        if (가슴운동_종목_추가_후_운동순서 == 1) {
                            System.out.println("벤치 프레스를 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                            System.out.println("2.인클라인 체스트 프레스 3.펙덱 플라이");
                            int 가슴운동_종목_추가_후_운동순서2 = sc.nextInt();
                            if (가슴운동_종목_추가_후_운동순서2 == 2) {
                                System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                System.out.println("마무리는 펙덱 플라이를 해야겠다.");
                            } else if (가슴운동_종목_추가_후_운동순서2 == 3) {
                                System.out.println("펙덱 플라이를 해야겠다.");
                                System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                            } else {//#12 가슴운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (가슴운동_종목_추가_후_운동순서 == 2) {
                            System.out.println("인클라인 체스트 프레스를 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                            System.out.println("1.벤치 프레스 3.펙덱 플라이");
                            int 가슴운동_종목_변경후_운동순서 = sc.nextInt();//종목 변경 가슴순서 3 == 2 (1)
                            if (가슴운동_종목_변경후_운동순서 == 1) {
                                System.out.println("벤치 프레스를 해야겠다.");
                                System.out.println("마무리는 펙덱 플라이를 해야겠다.");
                            } else if (가슴운동_종목_변경후_운동순서 == 3) {
                                System.out.println("펙덱 플라이를 해야겠다.");
                                System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                            } else {//#13 가슴운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (가슴운동_종목_추가_후_운동순서 == 3) {
                            System.out.println("펙덱 플라이를 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                            System.out.println("1.벤치 프레스 2.인클라인 체스트 프레스");
                            int 펙덱플라이_운동_후_다음순서 = sc.nextInt();//종목 추가 가슴순서 3 == 3 (2)
                            if (펙덱플라이_운동_후_다음순서 == 1) {
                                System.out.println("벤치 프레스를 해야겠다.");
                                System.out.println("마무리는 인클라인 체스트 프레스를 해야겠다.");
                            } else if (펙덱플라이_운동_후_다음순서 == 2) {
                                System.out.println("인클라인 체스트 프레스를 해야겠다.");
                                System.out.println("마무리는 벤치 프레스를 해야겠다.");
                            } else {//#14 가슴운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        }
                    } else if (종목추가 == 2) {//종목 추가하지 않았을 경우
                        System.out.println("하던 방식대로 해야겠다.어떤 걸 하면 좋을까?");
                        System.out.println("1.벤치 프레스 2.인클라인 체스트 프레스");
                        int 종목_추가없이_다음_가슴운동_순서 = sc.nextInt();
                        if (종목_추가없이_다음_가슴운동_순서 == 1) {
                            System.out.println("벤치 프레스를 해야겠다.");
                            System.out.println("(오늘 컨디션이 좋은데?)1.무게를 증량한다. 2.그대로 한다.");
                            int 무게증량 = sc.nextInt();
                            if (무게증량 == 1) {
                                System.out.println("무게를 증량해야겠다.");
                                System.out.println("(운동 도중)개수를 하나 더 해도 될까?");
                                System.out.println("1.개수를 더 한다. 2.그만한다.");
                                int 개수추가 = sc.nextInt();
                                if (개수추가 == 1) {
                                    System.out.println("겨우 끝냈다. 인클라인 체스트 프레스를 하고 끝내야겠다.");//#15 가슴운동 끝
                                } else if (개수추가 == 2) {
                                    System.out.println("볼륨 수가 너무 높아졌다. 여기서 끝내야겠다.");//#16 가슴운동 끝
                                } else {//#15 가슴운동 끝
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            } else if (무게증량 == 2) {
                                ;//무게증량 하지 않았을 경우
                                System.out.println("하던 무게로 해야겠다.");
                                System.out.println("마무리는 인클라인 체스트 프레스를 하고 끝내야겠다.");
                            } else {//#16 가슴운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        }
                    }
                }
            } else if (운동할_부위_선택 == 3) {//운동 부위 다리를 선택했을 때
                System.out.println("다리 운동을 해야겠다.");
                System.out.println("1.바벨 스쿼트 2. 레그 프레스 3. 레그 익스텐션");
                System.out.println("어떤 것을 먼저하면 좋을까?");
                int 다리_운동순서 = sc.nextInt();
                if (다리_운동순서 == 1) {
                    System.out.println("스쿼트를 먼저 해야겠다.");
                    System.out.println("(운동 중 다음과 같은 상황이 발생)");
                    System.out.println("1.배가 아픈 경우 2.바벨 원판 한 쪽만 끼워진 경우 3.통증이 너무 심한 경우");
                    int 운동중_난감한_상황 = sc.nextInt();
                    if (운동중_난감한_상황 == 1) {
                        System.out.println("(운동 중)배가 너무 아픈데 어떡하면 좋을까?");
                        System.out.println("1.운동을 진행한다. 2.화장실을 간다.");
                        int 화장실 = sc.nextInt();
                        if (화장실 == 1) {
                            System.out.println("하다보면 괜찮아지겠지");
                            System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                            System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                            int 다리_운동진행 = sc.nextInt();//운동부위 == 3 -> 다리순서 == 1
                            if (다리_운동진행 == 2) {
                                System.out.println("레그 프레스를 해야겠다.");
                                System.out.println("마무리는 레그 익스텐션을 해야겠다.");
                            } else if (다리_운동진행 == 3) {
                                System.out.println("레그 익스텐션을 해야겠다.");
                                System.out.println("마무리는 레그 프레스를 해야겠다.");
                            } else {//#1 다리운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (화장실 == 2) {//화장실을 간 경우
                            System.out.println("안되겠다. 화장실을 갔다 와야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 걸 하면 좋을까?");
                            System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                            int 화장실을_갔다_온_후_운동순서 = sc.nextInt();//다리순서 == 1 -> 난제 == 1
                            if (화장실을_갔다_온_후_운동순서 == 2) {
                                System.out.println("레그 프레스를 해야겠다.");
                                System.out.println("다시 배가 아파온다.");
                                System.out.println("1.계속 진행한다. 2.그만한다.");
                                int 화장실2 = sc.nextInt();
                                if (화장실2 == 1) {
                                    System.out.println("레그 익스텐션까지만 하고 화장실을 가야겠다.");
                                } else if (화장실2 == 2) {
                                    System.out.println("배가 아파서 여기까지만 해야곘다.");
                                } else {//#2 다리운동 끝
                                    System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                }
                            }
                        }
                    } else if (운동중_난감한_상황 == 2) {
                        System.out.println("(운동 중)바벨이 한 쪽으로 기울여져있다.");
                        System.out.println("1.불군형인 상태에서 진행한다. 2.도움을 요청한다.");
                        int 바벨이_한_쪽으로_기울어진_상황 = sc.nextInt();
                        if (바벨이_한_쪽으로_기울어진_상황 == 1) {
                            System.out.println("다음 세트에는 무게 균형 맞춰서 운동을 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                            int 다리운동_다음순서 = sc.nextInt();
                            if (다리운동_다음순서 == 2) {
                                System.out.println("레그프레스를 해야겠다.");
                                System.out.println("마무리는 레그 익스텐션을 해야겠다.");
                            } else if (다리운동_다음순서 == 3) {
                                System.out.println("레그익스텐션을 해야겠다.");
                                System.out.println("마무리는 레그프레스를 해야겠다.");
                            } else {//#3 다리운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (바벨이_한_쪽으로_기울어진_상황 == 2) {
                            System.out.println("나: 저기 죄송한데 도와주시겠어요?");
                            System.out.println("???: 어우 네 알겠습니다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                            int 도움을_받은_후_다음_운동순서 = sc.nextInt();
                            if (도움을_받은_후_다음_운동순서 == 2) {
                                System.out.println("레그프레스를 해야겠다.");
                                System.out.println("마무리는 레그 익스텐션을 해야겠다.");
                            } else if (도움을_받은_후_다음_운동순서 == 3) {
                                System.out.println("레그익스텐션을 해야겠다.");
                                System.out.println("마무리는 레그프레스를 해야겠다.");
                            } else {
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }//#4 다리운동 끝
                        } else {
                            System.out.println("이야기가 끝났습니다.");
                        }
                    } else if (운동중_난감한_상황 == 3) {//근육통이 너무 심할 때 상황
                        System.out.println("근육통이 너무 심한데 어떡하면 좋을까?");
                        System.out.println("1.계속 운동을 한다. 2.그만한다.");
                        int 근육통이_심한_상황 = sc.nextInt();
                        if (근육통이_심한_상황 == 1) {
                            System.out.println("안될 때까지 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("2. 레그 프레스 3. 레그 익스텐션");
                            int 근육통이_심한_상태로_운동_순서진행 = sc.nextInt();
                            if (근육통이_심한_상태로_운동_순서진행 == 2) {
                                System.out.println("레그프레스를 해야겠다.");
                                System.out.println("마무리는 레그 익스텐션을 해야겠다.");
                            } else if (근육통이_심한_상태로_운동_순서진행 == 3) {
                                System.out.println("레그익스텐션을 해야겠다.");
                                System.out.println("마무리는 레그프레스를 해야겠다.");
                            } else {
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (근육통이_심한_상황 == 2) {
                            System.out.println("통증이 너무 심해서 여기까지만 해야겠다.");
                        } else {
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }//#5 다리운동 끝
                    }
                } else if (다리_운동순서 == 2) {//다리 운동 순서 중 레그프레스를 선택한 상황
                    System.out.println("레그프레스를 먼저 해야겠다.");
                    System.out.println("하던 것만 하기엔 식상하니까 종목을 변경하면 어떨까?");
                    System.out.println("1.종목을 변경한다. 2.변경하지 않는다.");
                    int 다리운동_종목변경 = sc.nextInt();
                    if (다리운동_종목변경 == 1) {
                        System.out.println("핵스쿼트와 런지로 변경해야겠다.");
                        System.out.println("다음 중 어떤 걸 하면 좋을까?");
                        System.out.println("1. 런지 3. 핵스쿼트");
                        int 종목변경_후_다리_운동순서 = sc.nextInt();
                        if (종목변경_후_다리_운동순서 == 1) {
                            System.out.println("런지를 먼저 해야겠다.");
                            System.out.println("마무리는 핵스쿼트를 해야겠다.");
                        } else if (종목변경_후_다리_운동순서 == 1) {
                            System.out.println("핵스쿼트를 먼저해야겠다.");
                            System.out.println("마무리는 런지를 해야겠다.");
                        } else {//#6 다리운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (다리운동_종목변경 == 2) {//다리 운동 종목을 변경하지 않은 경우
                        System.out.println("하던 다리 운동 순서로 해야겠다.");
                        System.out.println("운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                        System.out.println("1.바벨 스쿼트 3.레그 익스텐션");
                        int 다리운동_종목변경_하지않고_루틴유지 = sc.nextInt();
                        if (다리운동_종목변경_하지않고_루틴유지 == 1) {
                            System.out.println("바벨 스쿼트를 먼저 해야겠다.");
                            System.out.println("마무리는 레그 익스텐션을 해야곘다.");
                        } else if (다리운동_종목변경_하지않고_루틴유지 == 2) {
                            System.out.println("레그 익스텐션을 먼저 해야겠다.");
                            System.out.println("마무리는 바벨 스쿼트를 해야곘다.");
                        }
                    } else {//#7 다리운동 끝
                        System.out.println("다리 운동이 끝났습니다.");
                    }
                } else if (다리_운동순서 == 3) {//다리 운동순서 레그 익스텐션을 선택한 상황
                    System.out.println("레그 익스텐션을 먼저 해야겠다.");
                    System.out.println("운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                    System.out.println("1.바벨 스쿼트 2.레그 프레스");
                    int 다리운동_순서_정하기 = sc.nextInt();
                    if (다리운동_순서_정하기 == 1) {
                        System.out.println("바벨 스쿼트를 먼저 해야겠다.");
                        System.out.println("마무리는 레그 프레스를 해야겠다.");
                    } else if (다리운동_순서_정하기 == 2) {
                        System.out.println("레그프레스를 먼저 해야겠다.");
                        System.out.println("(원판을 정리하지 않고 가는 사람을 목격한다.)");
                        System.out.println("1.원판을 정리하라고 말한다. 2.말하지 않고 고객 소리함에 제보한다.");
                        int 원판_정리 = sc.nextInt();
                        if (원판_정리 == 1) {
                            System.out.println("나: 실례지만 원판 정리 부탁드립니다.");
                            System.out.println("???: 네 알곘습니다.");
                            System.out.println("바벨 스쿼트를 마무리하고 가야겠다.");
                        } else if (원판_정리 == 2) {
                            System.out.println("말하지 않고 바로 고객 소리함에 제보해야겠다.");
                            System.out.println("바벨 스쿼트를 마무리하고 가야겠다.");
                        } else {//#8 다리운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }

                    } else {//#9 운동부위 다리 운동완결
                        System.out.println("다리 운동이 끝났습니다.");
                    }
                } else if (운동할_부위_선택 == 4) {//운동 부위 어깨를 선택한 상황
                    System.out.println("어깨 운동을 해야겠다.");
                    System.out.println("1.바벨 숄더 프레스 2.사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이 ");
                    System.out.println("어떤 것을 먼저 하면 좋을까?");
                    int 어깨_운동순서 = sc.nextInt();
                    if (어깨_운동순서 == 1) {
                        System.out.println("바벨 숄더 프레스를 먼저 해야겠다.");
                        System.out.println("시간을 단축하기 위해 타바타 운동 방식으로 할까?");
                        System.out.println("1.타바타 운동 방식 한다. 2.그대로 한다.");
                        int 타바타_운동_방식 = sc.nextInt();
                        if (타바타_운동_방식 == 1) {
                            System.out.println("20초 운동하고 10초 휴식해야겠다.");
                            System.out.println("종목도 추가하면 좋을 것 같은데...");
                            System.out.println("1.추가한다. 2.추가하지 않는다.");
                            int 어깨운동_종목추가 = sc.nextInt();
                            if (어깨운동_종목추가 == 1) {//어깨 종목을 추가한 상황
                                System.out.println("아놀드 덤벨 프레스와 플레이트로드와 숄더 프레스를 추가해야겠다.");
                                System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                System.out.println("2.사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이 4.플레이트로드 숄더 프레스 5.아놀드 덤벨 프레스");
                                int 추가한_종목포함_어깨_운동순서 = sc.nextInt();
                                if (추가한_종목포함_어깨_운동순서 == 2) {
                                    System.out.println("사이드 레터럴 레이즈를 먼저 해야겠다.");
                                    System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                    System.out.println("3. 벤트 오버 덤벨 플라이 4.플레이트로드 숄더 프레스 5.아놀드 덤벨 프레스");
                                    int 추가한_어깨운동_순서 = sc.nextInt();
                                    if (추가한_어깨운동_순서 == 3) {
                                        System.out.println("사이드 레터럴 레이즈를 해야겠다.");
                                        System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                        System.out.println("4.플레이트로드 숄더 프레스 5.아놀드 덤벨 프레스");
                                        int 추가한_어깨운동만_남은_상황 = sc.nextInt();
                                        if (추가한_어깨운동만_남은_상황 == 4) {
                                            System.out.println("(운동이 끝난 후)마무리는 아놀드 덤벨 프레스를 해야겠다.");
                                        } else if (추가한_어깨운동만_남은_상황 == 5) {
                                            System.out.println("(운동이 끝난 후)마무리는 플레이트로드 숄더 프레스를 해야겠다.");
                                        } else {//#1 어깨 운동 끝
                                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                        }
                                    }
                                } else if (추가한_종목포함_어깨_운동순서 == 3) {
                                    System.out.println("벤트 오버 덤벨 플라이를 먼저 해야겠다.");
                                    System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                    System.out.println("2. 사이드 레터럴 레이즈 4.플레이트로드 숄더 프레스 5.아놀드 덤벨 프레스");
                                    int 플라이를_제외한_운동순서 = sc.nextInt();
                                    if (플라이를_제외한_운동순서 == 2) {
                                        System.out.println("사이드 레터럴 레이즈를 먼저 해야겠다.");
                                        System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                        System.out.println("4.플레이트로드 숄더 프레스 5.아놀드 덤벨 프레스");
                                        int 플라이를_제외한_새로_추가한_종목만_남은_운동순서 = sc.nextInt();
                                        if (플라이를_제외한_새로_추가한_종목만_남은_운동순서 == 4) {
                                            System.out.println("(운동이 끝난 후)마무리는 아놀드 덤벨 프레스를 해야겠다.");
                                        } else if (플라이를_제외한_새로_추가한_종목만_남은_운동순서 == 5) {
                                            System.out.println("(운동이 끝난 후)마무리는 플레이트로드 숄더 프레스를 해야겠다.");
                                        } else {//#2 어깨 운동 끝
                                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                        }
                                    }
                                } else if (추가한_종목포함_어깨_운동순서 == 4) {
                                    System.out.println("플레이트로드 숄더 프레스를 먼저 해야겠다. ");
                                    System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                    System.out.println("2. 사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이 5.아놀드 덤벨 프레스");
                                    int 플레이트로드를_제외한_어깨_운동순서 = sc.nextInt();
                                    if (플레이트로드를_제외한_어깨_운동순서 == 2) {
                                        System.out.println("사이드 레터럴 레이즈를 먼저 해야겠다.");
                                        System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                        System.out.println("3. 벤트 오버 덤벨 플라이 5.아놀드 덤벨 프레스");
                                        int 플라이와_덤벨프레스 = sc.nextInt();
                                        if (플라이와_덤벨프레스 == 3) {
                                            System.out.println("(운동이 끝난 후)마무리는 아놀드 덤벨 프레스를 해야겠다.");
                                        } else if (플라이와_덤벨프레스 == 5) {
                                            System.out.println("(운동이 끝난 후)마무리는 벤트 오버 덤벨 플라이를 해야겠다.");
                                        } else {//#3 어깨 운동 끝
                                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                        }
                                    }
                                } else if (추가한_종목포함_어깨_운동순서 == 5) {
                                    System.out.println("아놀드 덤벨 프레스를 먼저 해야겠다. ");
                                    System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                    System.out.println("2. 사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이 4.플레이트로드 숄더 프레스");
                                    int 아놀드프레스를_제외한_어꺠_운동순서 = sc.nextInt();
                                    if (아놀드프레스를_제외한_어꺠_운동순서 == 2) {
                                        System.out.println("사이드 레터럴 레이즈를 먼저 해야겠다.");
                                        System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                                        System.out.println("3. 벤트 오버 덤벨 플라이 4.플레이트로드 숄더 프레스");
                                        int 플라이와_플레이트로드만_남은_어깨_운동순서 = sc.nextInt();
                                        if (플라이와_플레이트로드만_남은_어깨_운동순서 == 3) {
                                            System.out.println("(운동이 끝난 후)마무리는 플레이트로드 숄더 프레스를 해야겠다.");
                                        } else if (플라이와_플레이트로드만_남은_어깨_운동순서 == 4) {
                                            System.out.println("(운동이 끝난 후)마무리는 벤트 오버 덤벨 플라이를 해야겠다.");
                                        } else {//#4 어깨 운동 끝
                                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                        }
                                    }
                                }
                            } else if (어깨운동_종목추가 == 2) //어깨 종목을 추가하지 않는 상황
                                System.out.println("종목을 추가하지 않고 그대로 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("2. 사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이");
                            int 종목을_추가하지_않은_어깨_운동순서 = sc.nextInt();
                            if (종목을_추가하지_않은_어깨_운동순서 == 2) {
                                System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)마무리는 벤트 오버 덤벨 플라이를 해야겠다.");
                            } else if (종목을_추가하지_않은_어깨_운동순서 == 3) {
                                System.out.println("(벤트 오버 덤벨 플라이 운동이 끝난 후)마무리는 사이드 레터럴 레이즈를 해야겠다.");
                            } else {//#5 어깨 운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (타바타_운동_방식 == 2) {//타바타 운동 방식을 하지 않는 상황
                            System.out.println("하던 운동 방식대로 해야겠다.");
                            System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)마무리는 벤트 오버 덤벨 플라이를 해야겠다.");
                        } else {//#6 어깨 운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }

                    } else if (어깨_운동순서 == 2) {//운동어깨 순서 사이드 레터럴 레이즈를 먼저한 상황
                        System.out.println("사이드 레터럴 레이즈를 먼저 해야겠다.");
                        System.out.println("(운동 중)원하는 횟수만큼 강제 반복이 필요할 것 같다.");
                        System.out.println("1.강제 반복을 한다. 2.강제 반복없이 운동한다.");
                        int 강제반복 = sc.nextInt();
                        if (강제반복 == 1) {
                            System.out.println("성장을 위해서 강제 반복을 해야겠다.");
                            System.out.println("(운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("2. 사이드 레터럴 레이즈 3. 벤트 오버 덤벨 플라이");
                            int 강제반복이_끝난후_다음_어깨_운동순서 = sc.nextInt();
                            if (강제반복이_끝난후_다음_어깨_운동순서 == 2) {
                                System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)마무리는 벤트 오버 덤벨 플라이를 해야겠다.");
                            } else if (강제반복이_끝난후_다음_어깨_운동순서 == 3) {
                                System.out.println("(벤트 오버 덤벨 플라이 운동이 끝난 후)마무리는 사이드 레터럴 레이즈를 해야겠다.");
                            } else {//#7 어깨 운동 끝
                                System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                            }
                        } else if (강제반복 == 2) {//강제 반복없이 그대로 운동을 진행하는 상황
                            System.out.println("강제 반복없이 운동을 진행해야겠다.");
                            System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                            System.out.println("1.바벨 숄더 프레스 3. 벤트 오버 덤벨 플라이");
                            int 강제반복_없는_어깨_운동순서 = sc.nextInt();
                            if (강제반복_없는_어깨_운동순서 == 1) {
                                System.out.println("바벨 숄더 프레스를 해야겠다.");
                                System.out.println("(바벨 숄더 프레스 운동이 끝난 후)마무리는 벤트 오버 뎀벨 플라이를 해야겠다.");
                            } else if (강제반복_없는_어깨_운동순서 == 3)
                                System.out.println("벤트 오버 뎀벨 플라이를 해야겠다.");
                            System.out.println("마무리는 바벨 숄더 프레스를 해야겠다.");
                        } else {//#8 어깨 운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (어깨_운동순서 == 3) {//어깨운동 순서 벤트 오버 뎀벨 플라이 선택한 상황
                        System.out.println("벤트 오버 뎀벨 플라이를 먼저 해야겠다.");
                        System.out.println("(벤트 오버 뎀벨 플라이 운동이 끝난 후)다음은 어떤 운동을 하면 좋을까?");
                        System.out.println(" 1. 바벨 숄더 프레스 2. 사이드 레터럴 레이즈");
                        int 덤벨_플라이_끝난후_어깨_운동순서 = sc.nextInt();
                        if (덤벨_플라이_끝난후_어깨_운동순서 == 1) {
                            System.out.println("바벨 숄더 프레스를 해야겠다.");
                            System.out.println("(바벨 숄더 프레스 운동이 끝난 후)마무리는 사이드 레터럴 레이즈를 해야겠다.");
                        } else if (덤벨_플라이_끝난후_어깨_운동순서 == 2) {
                            System.out.println("사이드 레터럴 레이즈를 해야겠다.");
                            System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)세트를 추가하면 좋을 것 같은데...");
                            System.out.println("1.세트를 추가한다. 2.추가하지 않는다.");
                            int 세트_추가 = sc.nextInt();
                            if (세트_추가 == 1) {
                                System.out.println("아쉬우니까 세트를 추가해서 운동해야겠다.");
                                System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)마무리는 바벨 숄더 플레스를 해야겠다.");
                            } else if (세트_추가 == 2)
                                System.out.println("추가하지 않고 운동해야겠다.");
                            System.out.println("(사이드 레터럴 레이즈 운동이 끝난 후)마무리는 바벨 숄더 플레스를 해야겠다.");
                        } else {//#9 어깨 운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    }//어깨 운동 완결
                } else if (운동할_부위_선택 == 5) {
                    System.out.println("팔 운동을 해야겠다.");
                    System.out.println("어떤 걸 하면 좋을까?");
                    System.out.println("1.바벨컬 2.바벨 클로즈 그립 벤치 프레스");
                    int 팔_운동순서 = sc.nextInt();
                    if (팔_운동순서 == 1) {
                        System.out.println("바벨컬을 해야겠다.");
                        System.out.println("운동 방식을 어떻게 하면 좋을까?");
                        System.out.println("1.타바타 2.7-7-7");
                        int 팔_운동방식 = sc.nextInt();
                        if (팔_운동방식 == 1) {//타바타 운동방식
                            System.out.println("20초 운동하고 10초 휴식해야겠다.");
                            System.out.println("(바벨컬 운동이 끝난 후)마무리는 바벨 클로즈 그립 벤치 프레스를 해야겠다.");
                        } else if (팔_운동방식 == 2) {//7-7-7 운동방식
                            System.out.println("하단 7개, 중간 7개, 상단7개의 운동 방식으로 해야겠다.");
                            System.out.println("(바벨 클로즈 그립 벤치 프레스 운동이 끝난 후)마무리는 바벨컬을 해야겠다.");
                        } else {//#1 팔 운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        }
                    } else if (팔_운동순서 == 2) {
                        System.out.println("바벨 클로즈 그립 벤치 프레스를 해야겠다.");
                        System.out.println("운동 방식을 어떻게 하면 좋을까?");
                        System.out.println("1.휴식과 정지법 2.드랍 세트");
                        int 팔_휴식과_세트법_운동 = sc.nextInt();
                        if (팔_휴식과_세트법_운동 == 1) {//휴식과 정지법
                            System.out.println("최대 반복 수를 하고 10초 휴식 후 운동을 해야겠다.");
                            System.out.println("(바벨 클로즈 그립 벤치 프레스 운동이 끝난 후)종목을 추가해도 될 것 같은데");
                            System.out.println("1.추가한다. 2.추가하지 않는다.");
                            int 팔_운동_종목추가 = sc.nextInt();
                            if (팔_운동_종목추가 == 1) {
                                System.out.println("케이블 푸쉬다운과 덤벨 킥백을 추가해야겠다.");
                                System.out.println("다음은 어떤 것을 하면 좋을까?");
                                System.out.println("1.바벨컬 3.케이블 푸쉬다운 4.케이블 푸쉬다운");
                                int 푸쉬다운_덤벨킥백_추가 = sc.nextInt();
                                if (푸쉬다운_덤벨킥백_추가 == 1) {
                                    System.out.println("바벨컬을 해야겠다.");
                                    System.out.println("(바벨컬이 끝난 후)다음은 어떤 것을 하면 좋을까?");
                                    System.out.println("3.케이블 푸쉬다운 4.덤벨 킥백");
                                    int 바벨컬이_끝난후_다음_운동순서 = sc.nextInt();
                                    if (바벨컬이_끝난후_다음_운동순서 == 3) {
                                        System.out.println("케이블 푸쉬다운을 해야겠다.");
                                        System.out.println("(케이블 푸쉬다운이 끝난 후)마무리는 덤벨 킥백을 해야겠다.");
                                    } else if (바벨컬이_끝난후_다음_운동순서 == 4) {
                                        System.out.println("덤벨 킥백을 해야겠다.");
                                        System.out.println("(덤벨 킥백이 끝난 후)마무리는 케이블 푸쉬다운을 해야겠다.");
                                    } else {//#2 팔 운동 끝
                                        System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                                    }
                                }
                            }

                        } else if (팔_휴식과_세트법_운동 == 2) {//드랍 세트
                            System.out.println("무게를 낮춰가면서 쉬지 않고 최대 반복 수를 진행해야겠다.");
                            System.out.println("(바벨 클로즈 그립 벤치 프레스 운동이 끝난 후)마무리는 바벨컬을 해야겠다.");
                        } else {//#3 팔 운동 끝
                            System.out.println("잘 못 입력하셨습니다. 다시 실행해주세요.");
                        } //팔 운동 완결
                    }
                }
            }

        } else if (취미활동_선택 == 2) {// 하루일과 집에서 운동을 한다를 선택했을 떄 나오는 상황
            System.out.println("오늘은 집에서 운동을 해야겠다.");
            System.out.println("어떤 운동을 하면 좋을까?");
            System.out.println("1. 푸쉬업 2.스쿼트 3.턱걸이");
            int 맨몸_운동_선택 = sc.nextInt();
            if (맨몸_운동_선택 == 1) {
                System.out.println("푸쉬업을 해야겠다.");
                System.out.println("운동 방식은 어떻게 하면 좋을까?");
                System.out.println("1.타바타 2.30bpm 푸쉬업 3.1분 동안 최대 반복 횟수로 푸쉬업");
                int 맨몸_운동_방식 = sc.nextInt();
                if (맨몸_운동_방식 == 1) {//푸쉬업 타바타 운동을 선택하였을 떄
                    System.out.println("20초 운동하고 10초 휴식을 하는 운동 방식으로 진행해야겠다.");
                    System.out.println("(푸쉬업 타바타 운동을 끝낸 후)다음은 어떤 운동을 하면 좋을까?");
                    System.out.println("2.스쿼트 3.턱걸이");
                    int 푸쉬업_타바타_운동_이후_운동순서 = sc.nextInt();
                    if (푸쉬업_타바타_운동_이후_운동순서 == 2) {
                        System.out.println("스쿼트를 해야겠다.");
                        System.out.println("(스쿼트를 끝낸 후)하체 운동 종목을 추가하면 좋지 않을까?");
                        System.out.println("1.종목을 추가한다. 2.추가하지 않는다.");
                        int 스쿼트_운동_종목추가_결정 = sc.nextInt();
                        if (스쿼트_운동_종목추가_결정 == 1) {
                            System.out.println("어떤 것을 먼저하면 좋을까?");
                            System.out.println("1.와이드 스쿼트 2. 내로우 스쿼트");
                            int 종목추가_후_운동순서_결정 = sc.nextInt();
                            if (종목추가_후_운동순서_결정 == 1) {
                                System.out.println("와이드 스쿼트를 해야겠다.");
                                System.out.println("(와이드 스쿼트 운동을 끝낸 후)");
                                System.out.println("내로우 스쿼트를 그냥 끝내긴 아쉬운데 운동 방법을 추가하면 좋을 것 같은데");
                                System.out.println("1.추가한다. 추가하지 않는다.");
                                int 내로우_스쿼트_운동방법_결정 = sc.nextInt();
                                if (내로우_스쿼트_운동방법_결정 == 1) {
                                    System.out.println("타바타랑 30bpm 운동법 둘 중 하나를 선택해서 하는 것으로 운동해야겠다.");
                                    System.out.println("1.타바타 2.30bpm");
                                    int 내로우_스쿼트_운동방법 = sc.nextInt();
                                    if (내로우_스쿼트_운동방법 == 1) {
                                        System.out.println("20초 운동하고 10초 휴식을 하는 운동 방식으로 진행해야겠다.");
                                    } else if (내로우_스쿼트_운동방법 == 2) {
                                        System.out.println("30bpm에 맞춰서 스쿼트를 하는 운동 방식으로 진행해야겠다.");
                                    } else {//내로우 스쿼트 끝
                                        System.out.println("다음 종목을 선택해주세요.");
                                    }
                                }
                            } else if (종목추가_후_운동순서_결정 == 2) {
                                System.out.println("내로우 스쿼트를 해야겠다.");
                                System.out.println("(내로우 스쿼트 운동을 끝낸 후)마무리는 와이드 스쿼트를 해야겠다.");
                            } else {
                                System.out.println("내로우&와이드 운동을 끝냈기 때문에 종료하겠습니다.");
                            }
                        }
                    }

                }
            }
        }
    }
}
