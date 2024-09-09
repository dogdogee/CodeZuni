        Random rand = new Random();
        Scanner Input = new Scanner(System.in);
        System.out.println("nhap hang :");
        int row = Integer.parseInt(Input.nextLine());
        System.out.println("nhap dong : ");
        int column = Integer.parseInt(Input.nextLine());
        int a[][] = Input(row,column,rand);
        Xuat(row, column, a);