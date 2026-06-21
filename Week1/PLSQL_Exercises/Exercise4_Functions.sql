CREATE OR REPLACE FUNCTION
CalculateAge(
    p_dob DATE
)
RETURN NUMBER
IS
BEGIN

    RETURN FLOOR(
    MONTHS_BETWEEN(
        SYSDATE,
        p_dob
    )/12);

END;
/

CREATE OR REPLACE FUNCTION
CalculateMonthlyInstallment(
    p_amount NUMBER,
    p_rate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
BEGIN

    RETURN
    (p_amount *
    (1+p_rate/100))
    /(p_years*12);

END;
/

CREATE OR REPLACE FUNCTION
HasSufficientBalance(
    p_account NUMBER,
    p_amount NUMBER
)
RETURN VARCHAR2
IS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID=p_account;

    IF v_balance >= p_amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

END;
/