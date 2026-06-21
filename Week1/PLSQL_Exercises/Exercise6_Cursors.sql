DECLARE

CURSOR c_trans IS

SELECT *
FROM Transactions
WHERE EXTRACT(MONTH
FROM TransactionDate)
=
EXTRACT(MONTH
FROM SYSDATE);

v_rec Transactions%ROWTYPE;

BEGIN

OPEN c_trans;

LOOP

FETCH c_trans INTO v_rec;

EXIT WHEN c_trans%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
'Transaction: '
|| v_rec.TransactionID);

END LOOP;

CLOSE c_trans;

END;
/

DECLARE

CURSOR c_acc IS
SELECT AccountID
FROM Accounts;

BEGIN

FOR acc IN c_acc LOOP

UPDATE Accounts
SET Balance =
    Balance - 100
WHERE AccountID =
      acc.AccountID;

END LOOP;

COMMIT;

END;
/

DECLARE

CURSOR c_loan IS
SELECT LoanID
FROM Loans;

BEGIN

FOR loan IN c_loan LOOP

UPDATE Loans
SET InterestRate =
    InterestRate + 0.5
WHERE LoanID =
      loan.LoanID;

END LOOP;

COMMIT;

END;
/