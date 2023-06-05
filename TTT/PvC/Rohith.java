import java.io.*;
class Side
{
    public void printer(int arr[])
    {
        int i;
        for(i=1;i<10;i++)
        {
            if(arr[i-1]==-1)
            {
                System.out.print("x ");
            }
            else if(arr[i-1]==0)
            {
                System.out.print("o ");
            }
            else
            {
                System.out.print("_ ");
            }
            
            if(i%3==0) System.out.println();
        }
    }
}
class Case1 extends Side
{
    public void compfirst(int arr[]) throws IOException
    {
        int index;
        String str;
        arr[0]=-1;
        printer(arr);
        //-1 for x and 0 for o
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the position number");
        
        ///starts here
        while((str=(br.readLine()))!=null)
        {
        index=Integer.parseInt(str);
        if(index!=5)
        {
            if(index==2)
            {
                //first case
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index!=4)
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    //arr[index]
                    printer(arr);
                }
                else
                {
                    arr[8]=-1;
                    arr[3]=0;
                    printer(arr);
                    System.out.println("Enter the position number");
                    index=Integer.parseInt(br.readLine());
                    if(index==5)
                    {
                        arr[7]=-1;
                        arr[index-1]=0;
                        printer(arr);
                    }
                    else if(index==8)
                    {
                        arr[4]=-1;
                        arr[index-1]=0;
                        printer(arr);
                    }
                    else
                    {
                        arr[7]=-1;
                        arr[index-1]=0;
                        printer(arr);
                    }
                }
            }
            else if(index==3)
            {//second case
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==9)
                {
                    arr[8]=0;
                    arr[3]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                    printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==5)
                {
                    arr[index-1]=0;
                    arr[7]=-1;
                    printer(arr);
                }
                else if(index==8)
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[7]=-1;
                    printer(arr);
                }
                }
            }
            else if(index==4)
            {//third case
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==2)
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                    printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==5)
                {
                    arr[index-1]=0;
                    arr[5]=-1;
                    printer(arr);
                }
                else if(index==6)
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                }
                }
                else
                {
                    arr[index-1]=0;
                    arr[1]=-1;
                    printer(arr);
                }
            }
            else if(index==6)
            {//four case
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==4)
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==3)
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[2]=-1;
                    printer(arr);
                }
                }
                else
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                }
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==2)
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                    printer(arr);
                    System.out.println("Enter the position number");
                    index=Integer.parseInt(br.readLine());
                    if(index==5)
                    {
                        arr[index-1]=0;
                        arr[5]=-1;
                        printer(arr);
                    }
                    else if(index==6)
                    {
                        arr[index-1]=0;
                        arr[4]=-1;
                        printer(arr);
                    }
                    else
                    {
                        arr[index-1]=0;
                        arr[5]=-1;
                        printer(arr);
                    }
                }
                else
                {
                    arr[index-1]=0;
                    arr[1]=-1;
                    printer(arr);
                }
            }
            else if(index==8)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==4)
                {
                    arr[index-1]=0;
                    arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==2)
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                }
                else if(index==5)
                {
                    arr[index-1]=0;
                    arr[1]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[1]=-1;
                    printer(arr);
                }
                }
                else
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                }
            }
            else if(index==9)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==2)
                {
                    arr[index-1]=0;
                    arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==4)
                {
                    arr[index-1]=0;
                    arr[4]=-1;
                    printer(arr);
                }
                else if(index==5)
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                }
                else
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                }
                }
                else
                {
                    arr[index-1]=0;
                    arr[1]=-1;
                    printer(arr);
                }
            }
            else
            {
                System.out.println("Invalid");
            }
            System.out.println("Computer wins");
            break;
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(br.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(br.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(br.readLine());
            if(index==7)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Computer wins");
                break;
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Draw");
                break;
            }
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==7)
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                    printer(arr);
                    System.out.println("Draw");
                    break;
                }
                else
                {
                    arr[index-1]=0;
                    arr[6]=-1;
                printer(arr);
                System.out.println("Computer wins");
                break;
                }
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==4)
                {
                    arr[index-1]=0;
                    arr[8]=-1;
                printer(arr);
                System.out.println("Computer wins");
                break;
                }
                else
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                    System.out.println("Draw");
                    break;
                }
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(br.readLine());
                if(index==6)
                {
                    arr[index-1]=0;
                    arr[6]=-1;
                printer(arr);
                System.out.println("Computer wins");
                break;
                }
                else
                {
                    arr[index-1]=0;
                    arr[5]=-1;
                    printer(arr);
                    System.out.println("Draw");
                    break;
                }
            }
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer wins");
                break;
            }
        }
        }
    }
}
class Case2 extends Side
{
    public void userfirst(int arr[]) throws IOException
    {
    int index;
    BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
if(index==1)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==2)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[1]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==8)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[7]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==2)
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==7)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                printer(arr);
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }   
    else if(index==7)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==7)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==2)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }

    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
            else if(index==3)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }

    }
    else 
    {
        arr[index-1]=0;
        arr[5]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==3)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[1]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==8)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[8]=-1;
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else 
    {
        arr[index-1]=0;
        arr[5]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==4)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            if(index==3)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==9)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==2)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==5)
{
    arr[index-1]=0;
    arr[0]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==2)
    {
        arr[index-1]=0;
        arr[7]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else if(index==4)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                if(index==4)
                {
                    arr[index-1]=0;
                    System.out.println("Enter the position number");
                    index=Integer.parseInt(bb.readLine());
                    arr[5]=-1;
                    printer(arr);
                    System.out.println("Enter the position number");
                    index=Integer.parseInt(bb.readLine());
                    arr[index-1]=0;
                    System.out.println("Draw");
                }
                else
                {
                    arr[index-1]=0;
                    arr[3]=-1;
                    printer(arr);
                    System.out.println("Computer Wins");
                }
            }
        }
        else if(index==6)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==7)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[8]=-1;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else if(index==7)
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[5]=-1;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        } 
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==8)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[5]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==2)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==7)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else     
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            } 
        }
        else if(index==3)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==8)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else if(index==7)
        {}
        else if(index==8)
        {}
        else
        {//index ==9}
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=0;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==2)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[1]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    } 
}
else if(index==6)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==8)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==3)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==7)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==4)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[8]=-1;
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==3)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==8)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[7]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==2)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            if(index==6)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else if(index==8)
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[0]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==9)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
            else if(index==3)
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==6)
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==9)
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[8]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[8]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[0]=-1;
                System.out.println("Computer Wins");
            }
        }
        else 
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[8]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==1)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==6)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[0]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
else
{
    arr[index-1]=0;
    arr[4]=-1;
    printer(arr);
    System.out.println("Enter the position number");
    index=Integer.parseInt(bb.readLine());
    if(index==1)
    {
        arr[index-1]=0;
        arr[3]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==6)
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==7)
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[6]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==2)
    {
        arr[index-1]=0;
        arr[5]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==3)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==3)
    {
        arr[index-1]=0;
        arr[5]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==4)
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==8)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[7]=-1;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==4)
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==1)
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else if(index==2)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else 
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==6)
    {
        arr[index-1]=0;
        arr[2]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==7)
        {
            arr[index-1]=0;
            arr[7]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==2)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[1]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[6]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
    else if(index==7)
    {
        arr[index-1]=0;
        arr[7]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==2)
        {
            arr[index-1]=0;
            arr[3]=-1;
            printer(arr);
            if(index==6)
            {
                arr[index-1]=0;
                arr[2]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[5]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[1]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        } 
    }
    else
    {
        arr[index-1]=0;
        arr[6]=-1;
        printer(arr);
        System.out.println("Enter the position number");
        index=Integer.parseInt(bb.readLine());
        if(index==3)
        {
            arr[index-1]=0;
            arr[5]=-1;
            printer(arr);
            System.out.println("Enter the position number");
            index=Integer.parseInt(bb.readLine());
            if(index==4)
            {
                arr[index-1]=0;
                arr[0]=-1;
                printer(arr);
                System.out.println("Enter the position number");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                printer(arr);
                System.out.println("Draw");
            }
            else
            {
                arr[index-1]=0;
                arr[3]=-1;
                printer(arr);
                System.out.println("Computer Wins");
            }
        }
        else
        {
            arr[index-1]=0;
            arr[2]=-1;
            printer(arr);
            System.out.println("Computer Wins");
        }
    }
}
}
}
class Rohith
{
    public static void main(String a[])throws IOException
    {
        //computer takes -1(x) and user takes 0(o)
        int i,counter=0;
        System.out.println("INSTRUCTIONS");
        System.out.println("Note the number format below for entries");
        int arr[]=new int[9];
        for(i=1;i<10;i++)
        {
            arr[i-1]=i;
            System.out.print(i+" ");
            if(i%3==0) System.out.println();
        }
        System.out.println("Computer-->x\nUser-->o");
        System.out.println("Enter Ctrl+c to terminate the game");
        System.out.print("\n\n\n");
        Case1 ob=new Case1();
        Case2 gg=new Case2();
        while(1>=0)
        {
            if(counter%2==0)
            {
                ob.compfirst(arr);
            }
            else
            {
                gg.userfirst(arr);
            }
            counter++;
            for(i=0;i<9;i++)
            {
                arr[i]=i+1;
            }
        }
    }
}