using System;

namespace SchoolRecords
{
    public class Students
    {
        private readonly Student[] contents;
        private int currentSize;

        public Students(int maxSize)
        {
            contents = new Student[maxSize];
        }

        public int getCurrentSize()
        {
            return currentSize;
        }

        public int addStudent(Student theStudent)
        {
            if (currentSize >= contents.Length) return -1;
            contents[currentSize] = theStudent;
            currentSize++;
            return 0;
        }

        public Student getStudent(int position)
        {
            if ((position < 0) | (position >= currentSize))
            {
                return null;
            }

            return contents[position];
        }

        public Student getStudent(string theFirstName, string theLastName)
        {
            for (int i = 0; i < currentSize; i++)
            {
                if ((contents[i].getFirstName() == theFirstName) && (contents[i].getLastName() == theLastName))
                    return contents[i];
            }

            return null;
        }

        public int removeStudent(string theFirstName, string theLastName)
        {
            for (int i = 0; i < currentSize; i++)
            {
                if ((contents[i].getFirstName() == theFirstName) && (contents[i].getLastName() == theLastName))
                {
                    contents[i] = contents[currentSize - 1];
                    contents[currentSize - 1] = null;
                    currentSize--;
                    return 0;
                }
            }

            return -1;
        }

        public override string ToString()
        {
            string temp = "Students: ";
            for (int i = 0; i < currentSize - 1; i++)
            {
                temp = temp + contents[i];
            }

            return temp + Environment.NewLine;
        }
    }
}