#include<stdio.h>

int main()
{
    int n, k, count = 0;
    scanf("%d %d", &n, &k);

    int performer[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &performer[i]);
    }

    int score = performer[k-1];

    for (int i = 0; i < n; i++)
    {
        if (performer[i] >= score && performer[i] > 0)
        {
            count++;
        }  
    }
    
    printf("%d", count);

    return 0;    
}