import java.io.*;
class Side
{
    // p1 -x p2 -o
    // x -1     o rep 0
    public int[] check(int arr[])
    {
        int a[]=new int[2];
        int i;
        if((arr[0]==0&&arr[1]==0&&arr[2]==0)||(arr[0]==-1&&arr[1]==-1&&arr[2]==-1))
        {
            if((arr[0]==0&&arr[1]==0&&arr[2]==0))
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[3]==0&&arr[4]==0&&arr[5]==0)||(arr[3]==-1&&arr[4]==-1&&arr[5]==-1))
        {
            if((arr[3]==0&&arr[4]==0&&arr[5]==0))
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[6]==0&&arr[7]==0&&arr[8]==0)||(arr[6]==-1&&arr[7]==-1&&arr[8]==-1))
        {
            if(arr[6]==0&&arr[7]==0&&arr[8]==0)
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[0]==0&&arr[3]==0&&arr[6]==0)||(arr[0]==-1&&arr[3]==-1&&arr[6]==-1))
        {
            if(arr[0]==0&&arr[3]==0&&arr[6]==0)
            {
                a[0]=1;
                a[0]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[1]==0&&arr[4]==0&&arr[7]==0)||(arr[1]==-1&&arr[4]==-1&&arr[7]==-1))
        {
            if(arr[1]==0&&arr[4]==0&&arr[7]==0)
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[2]==0&&arr[5]==0&&arr[8]==0)||(arr[2]==-1&&arr[5]==-1&&arr[8]==-1))
        {
            if(arr[2]==0&&arr[5]==0&&arr[8]==0)
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1;
            }
            return a;
        }
        else if((arr[0]==0&&arr[4]==0&&arr[8]==0)||(arr[0]==-1&&arr[4]==-1&&arr[8]==-1))
        {
            if(arr[0]==0&&arr[4]==0&&arr[8]==0)
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1; 
            }
            return a;
        }
        else if((arr[2]==0&&arr[4]==0&&arr[6]==0)||(arr[2]==-1&&arr[4]==-1&&arr[6]==-1))
        {
            if(arr[2]==0&&arr[4]==0&&arr[6]==0)
            {
            a[0]=1;
            a[1]=2;
            }
            else
            {
                a[0]=1;
                a[1]=1; 
            }
            return a;
        }
        else
        {
            for(i=0;i<9;i++)
            {
                if(arr[i]==-1)
                {}
                else if(arr[i]==0)
                {}
                else
                {
                    a[0]=0;
                    a[1]=0;
                    return a;
                }
            }
            a[0]=0;
            a[1]=1;
            return a;
        }
    }
}
class Game extends Side
{
    int i;
    public void printer(int arr[]) throws IOException
    {
        for(i=0;i<9;i++)
        {
            if(arr[i]==0)
            {
                System.out.print("o ");
            }
            else if(arr[i]==-1)
            {
                System.out.print("x ");
            }
            else
            {
                System.out.print("_ ");
            }
            if(i==2||i==5||i==8)
            {
                System.out.println();
            }
        }
    }
    //1 1 p1 wins
    //1 2 p2 wins
    //0 0 not done yet
    //0 1 draw
    public void ttt(int arr[],int start) throws IOException
    {
        BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
        int  counter,index;
        int temp[]=new int[2];
        System.out.println("INSTRUCTIONS");
        System.out.println("Note the number format below for entries");
        for(i=1;i<10;i++)
        {
            System.out.print(i+" ");
            if(i%3==0) System.out.println();
        }
        System.out.println("Player 1-->x\nPlayer 2-->o");
        System.out.println("\n\n\n");
        if(start%2==1)
        {
            counter=1;
        }
        else
        {
            counter=0;
        }
        temp=check(arr);
        while (temp[0]==0&&temp[1]==0)
        {
            if(counter%2==1)
            {
                printer(arr);
                System.out.println("Player 1 chance");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=-1;
                counter++;
            }
            else
            {
                printer(arr);
                System.out.println("Player 2 chance");
                index=Integer.parseInt(bb.readLine());
                arr[index-1]=0;
                counter++;
            }
            if(temp[1]>=1)
            {
                break;
            }
            else
            {
            temp=check(arr);
            }
        }
        if(temp[0]==1)
        {
            if(temp[1]==1)
            {
                printer(arr);
                System.out.println("Player 1 Wins  \n\n\n");
            }
            else
            {
                printer(arr);
                System.out.println("Player 2 wins \n\n\n");
            }
        }
        else
        {
            System.out.println("Draw \n\n\n");
        }
    }
}
class Rohith
{
    public static void main(String args[]) throws IOException
    {
        int  counter=0,i;
        String temp;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[9];
        for(i=0;i<9;i++)
        {
            arr[i]=i+1;
        }
        Game ob=new Game();
        while(1>=0)
        {
            if(counter%2==0)
            {
                System.out.println("Player 1 plays first");
                ob.ttt(arr,1);
                counter++;
            }
            else
            {
                System.out.println("Player 2 plays first");
                ob.ttt(arr,2);
                counter++;
            }
            System.out.println("Enter Y to play once more and Enter N to Quit");
            temp=br.readLine();
            if(temp.equalsIgnoreCase("y")==true)
            {
                for(i=0;i<9;i++)
                {
                 arr[i]=i+1;
                }
            }
            else
            {
                break;
            } 
        }
    }
}