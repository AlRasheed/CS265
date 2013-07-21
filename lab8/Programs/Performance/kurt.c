/******-*-c-*-**********************************************************
 * quicksort.c - C implementation of quicksort (for integers)
 * 
 * CS265
 * winter '05
 * 
 * gcc 3.3.1 on Mandrake 9.2
 ***********************************************************************/

int a[] = { 23, 4, 8, 15, 16, 42, 7, 5, 1, 18 };

void dbg()
{
	int i;
	for( i=0; i<10; ++i )
		printf( "%3d", a[i] );
}

/* swap:  interchange v[i] and v[j]. */
void swap(int v[], int i, int j)
{
     int temp;

     temp = v[i];
     v[i] = v[j];
     v[j] = temp;
}


/* quicksort: sort v[0]..v[n-1] into increasing order. */
void quicksort(int v [], int n, int *c)
{
     int i, last, myCount;

		 ++(*c);

		 myCount = *c;

     if (n <= 1)                         /* nothing to do */
		 {
			 printf( "%2d: ", myCount );
			 dbg();
			 printf( "\n" );
			 return;
		 }

//     swap(v,0,rand() % n);       /* move pivot element to v[0] */
     last = 0;
     for (i = 1; i < n; i++)         /* partition */
           if (v[i] < v[0])
               swap(v,++last, i);
     swap(v, 0, last);                 /* restore pivot */

		 printf( "%2d: ", myCount );
		 dbg();
		 printf( "\n" );

     quicksort(v,last,c);               /* recursively sort each part. */
     quicksort(v+last+1, n-last-1, c);
}

int main()
{
	int i;
	int count = 0;

	quicksort( a, 10, &count );

	printf( "\nAnd we finish with:\n\t" );
	for( i=0; i<10; ++i )
	 printf( "%3d", a[i] );
	printf( "\n" );

	return 0;
}
