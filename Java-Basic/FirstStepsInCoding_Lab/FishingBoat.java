import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Summer")) {
            if (count <= 6) {
                if (count % 2 == 0) {
                    price = 4200 - (4200 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 4200 - (4200 * 0.10);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } if (count >= 7 && count <= 11) {
                if (count % 2 == 0) {
                    price = 4200 - (4200 * 0.20);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 4200 - (4200 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } else if (count >= 12) {
                if (count % 2 == 0) {
                    price = 4200 - (4200 * 0.30);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 4200 - (4200 * 0.25);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            }
        } else if (season.equals("Autumn")) {
            if (count <= 6) {
                price = 4200 - (4200 * 0.10);
                if (budget >= price) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                }
            } if (count >= 7 && count <= 11) {
                price = 4200 - (4200 * 0.15);
                if (budget >= price) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                }
            } if (count > 12) {
                price = 4200 - (4200 * 0.25);
                if (budget >= price) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                }
            }
        } else if (season.equals("Spring")) {
            if (count <= 6) {
                if (count % 2 == 0) {
                    price = 3000 - (3000 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 3000 - (3000 * 0.10);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } if (count >= 7 && count <= 11) {
                if (count % 2 == 0) {
                    price = 3000 - (3000 * 0.20);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 3000 - (3000 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } else if (count >= 12) {
                if (count % 2 == 0) {
                    price = 3000 - (3000 * 0.30);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 3000 - (3000 * 0.25);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            }
        } else if (season.equals("Winter")) {
            if (count <= 6) {
                if (count % 2 == 0) {
                    price = 2500 - (2500 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 2600 - (2600 * 0.10);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } if (count >= 7 && count <= 11) {
                if (count % 2 == 0) {
                    price = 2600 - (2600 * 0.20);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 2600 - (2600 * 0.15);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            } else if (count >= 12) {
                if (count % 2 == 0) {
                    price = 2600 - (2600 * 0.30);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                } if (count % 2 != 0) {
                    price = 2600 - (2600 * 0.25);
                    if (budget >= price) {
                        System.out.printf("Yes! You have %.2f leva left.", (budget - price));
                    } else if (price > budget) {
                        System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
                    }
                }
            }
        }
    }
}




