
#include <stdio.h>
#include<string.h>
//length
int stringLength(char str[])
{
    int length=0;
    while(str[length]!='\0')
    {
        length++;
    }
    return length;
}
//concatenate
int stringConcat(char str1[],char str2[])
{
    int destinationlen=stringLength(str2);
    int i=0;
    while(str1[i]!='\0')
    {
        str2[destinationlen +1]=str1[i];//+1 is an index value
        i++;
    }
    str2[destinationlen+i]='\0';
}
//compare
int stringComp(char str3[],char str4[])
{
    int i=0;
    while(str3[i]!='\0'&& str4[i]!='\0')
    {
        if(str3[i]<str4[i])
        {
            return -1;
        }
        else if(str3[i]>str4[i])
        {
            return 1;
        }
        i++;
    }
    if(str3[i]=='\0'&&str4[i]=='\0')
    {
        return 0;
    }
    else if(str4[i]=='\0')
    {
        return -1;
    }
    else
    {
        return 1; 
    }
}
int main()
{
    char str1[30]="kaussi";
    char str2[40]="placement";
    printf("String 1: %s\n",str1);
    printf("String 2: %s\n",str2);
    //finding the length in String
    printf("Length of a string1: %d\n",stringLength(str1));
    printf("Length of a string2: %d\n",stringLength(str2));
    //finding the concatenation
    int comparisionResult=stringComp("Hello","Hai");
    if(comparisionResult==0)
    {
        printf("String 1 and String 2 are equal\n");
    }
    else if(comparisionResult<0)
    {
        printf("String 1 is less than String 2\n");
    }
    else
    {
        printf("String 1 is greater than String 2\n");
    }
    return 0;

}

