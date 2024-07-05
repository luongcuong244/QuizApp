package com.azamovhudstc.quizapp.model;

public class Question {
    private String questionText;
    private Option[] options;
    private QuestionCategory category;

    Question(String questionText, Option[] options, QuestionCategory category) {
        this.questionText = questionText;
        this.options = options;
        this.category = category;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public QuestionCategory getCategory() {
        return category;
    }

    public void setCategory(QuestionCategory category) {
        this.category = category;
    }

    public static int countQuestions(QuestionCategory category) {
        int count = 0;
        for (Question question : allQuestions) {
            if (question.getCategory() == category) {
                count++;
            }
        }
        return count;
    }

    public static Question[] allQuestions = {
            new Question(
                    "Đơn vị cơ bản của sự sống là gì?",
                    new Option[]{
                            new Option("Tế bào", true),
                            new Option("Nguyên tử", false),
                            new Option("Phân tử", false),
                            new Option("Mô", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "ADN nằm ở đâu trong tế bào?",
                    new Option[]{
                            new Option("Nhân tế bào", true),
                            new Option("Màng tế bào", false),
                            new Option("Tế bào chất", false),
                            new Option("Ti thể", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Quá trình nào chuyển đổi năng lượng ánh sáng thành năng lượng hóa học?",
                    new Option[]{
                            new Option("Quang hợp", true),
                            new Option("Hô hấp tế bào", false),
                            new Option("Lên men", false),
                            new Option("Hấp thụ", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Động vật nào là loài có vú duy nhất có khả năng bay?",
                    new Option[]{
                            new Option("Dơi", true),
                            new Option("Chim cánh cụt", false),
                            new Option("Chuột túi", false),
                            new Option("Chim hải âu", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Quá trình nào tế bào phân chia để tạo ra hai tế bào con có cùng bộ gen?",
                    new Option[]{
                            new Option("Phân bào nguyên nhiễm (mitosis)", true),
                            new Option("Phân bào giảm nhiễm (meiosis)", false),
                            new Option("Tự thực (autophagy)", false),
                            new Option("Apoptosis", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Loại đường nào được tìm thấy nhiều nhất trong máu của con người?",
                    new Option[]{
                            new Option("Glucose", true),
                            new Option("Fructose", false),
                            new Option("Sucrose", false),
                            new Option("Lactose", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Động vật nào có thể tái sinh các phần cơ thể bị mất?",
                    new Option[]{
                            new Option("Con thằn lằn", true),
                            new Option("Con chó", false),
                            new Option("Con mèo", false),
                            new Option("Con ngựa", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Protein nào mang oxy trong máu của con người?",
                    new Option[]{
                            new Option("Hemoglobin", true),
                            new Option("Myoglobin", false),
                            new Option("Albumin", false),
                            new Option("Fibrinogen", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Ai là người phát hiện ra cấu trúc xoắn kép của ADN?",
                    new Option[]{
                            new Option("James Watson và Francis Crick", true),
                            new Option("Gregor Mendel", false),
                            new Option("Rosalind Franklin", false),
                            new Option("Charles Darwin", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Hệ thống nào chịu trách nhiệm bảo vệ cơ thể khỏi các bệnh tật?",
                    new Option[]{
                            new Option("Hệ miễn dịch", true),
                            new Option("Hệ tuần hoàn", false),
                            new Option("Hệ hô hấp", false),
                            new Option("Hệ tiêu hóa", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Enzyme nào giúp tiêu hóa tinh bột trong miệng?",
                    new Option[]{
                            new Option("Amylase", true),
                            new Option("Protease", false),
                            new Option("Lipase", false),
                            new Option("Lactase", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Loại tế bào nào trong máu giúp chống lại nhiễm trùng?",
                    new Option[]{
                            new Option("Bạch cầu (leukocytes)", true),
                            new Option("Hồng cầu (erythrocytes)", false),
                            new Option("Tiểu cầu (platelets)", false),
                            new Option("Tế bào máu đỏ (red blood cells)", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Quá trình nào cây sử dụng để lấy nước từ đất?",
                    new Option[]{
                            new Option("Hấp thụ (absorption)", true),
                            new Option("Thoát hơi nước (transpiration)", false),
                            new Option("Quang hợp (photosynthesis)", false),
                            new Option("Hô hấp (respiration)", false),
                    },
                    QuestionCategory.BIOLOGY
            ),
            new Question(
                    "Tốc độ ánh sáng trong chân không là bao nhiêu?",
                    new Option[]{
                            new Option("299,792,458 m/s", true),
                            new Option("150,000,000 m/s", false),
                            new Option("300,000,000 m/s", false),
                            new Option("250,000,000 m/s", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Đơn vị đo điện trở là gì?",
                    new Option[]{
                            new Option("Ohm", true),
                            new Option("Volt", false),
                            new Option("Ampere", false),
                            new Option("Watt", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Ai là người phát hiện ra định luật vạn vật hấp dẫn?",
                    new Option[]{
                            new Option("Isaac Newton", true),
                            new Option("Albert Einstein", false),
                            new Option("Galileo Galilei", false),
                            new Option("Nikola Tesla", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Điện tích của một electron là gì?",
                    new Option[]{
                            new Option("-1.6 x 10^-19 coulombs", true),
                            new Option("1.6 x 10^-19 coulombs", false),
                            new Option("1.6 x 10^-9 coulombs", false),
                            new Option("-1.6 x 10^-9 coulombs", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Đơn vị đo công suất là gì?",
                    new Option[]{
                            new Option("Watt", true),
                            new Option("Joule", false),
                            new Option("Newton", false),
                            new Option("Pascal", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Ai là người phát triển thuyết tương đối?",
                    new Option[]{
                            new Option("Albert Einstein", true),
                            new Option("Isaac Newton", false),
                            new Option("Niels Bohr", false),
                            new Option("Galileo Galilei", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Một Newton bằng bao nhiêu?",
                    new Option[]{
                            new Option("1 kg·m/s²", true),
                            new Option("1 kg·m/s", false),
                            new Option("1 kg·m²/s²", false),
                            new Option("1 kg·m", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Năng lượng của một photon được tính bằng công thức nào?",
                    new Option[]{
                            new Option("E = hf", true),
                            new Option("E = mc²", false),
                            new Option("E = mv²/2", false),
                            new Option("E = Fd", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Định luật thứ nhất của Newton là gì?",
                    new Option[]{
                            new Option("Một vật sẽ ở trạng thái nghỉ hoặc chuyển động thẳng đều nếu không có lực tác dụng lên nó.", true),
                            new Option("Lực bằng khối lượng nhân gia tốc.", false),
                            new Option("Mỗi lực tác dụng đều có một lực phản tác dụng bằng và ngược chiều.", false),
                            new Option("Năng lượng không tự sinh ra và không tự mất đi, chỉ chuyển từ dạng này sang dạng khác.", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Tần số dao động của một lò xo đơn giản phụ thuộc vào yếu tố nào?",
                    new Option[]{
                            new Option("Độ cứng của lò xo và khối lượng của vật nặng.", true),
                            new Option("Biên độ dao động.", false),
                            new Option("Gia tốc trọng trường.", false),
                            new Option("Độ dài của lò xo.", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Đơn vị đo áp suất là gì?",
                    new Option[]{
                            new Option("Pascal", true),
                            new Option("Newton", false),
                            new Option("Joule", false),
                            new Option("Watt", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Nguyên lý bất định Heisenberg phát biểu rằng?",
                    new Option[]{
                            new Option("Không thể đồng thời xác định chính xác cả vị trí và động lượng của một hạt.", true),
                            new Option("Năng lượng của một hệ thống kín là bảo toàn.", false),
                            new Option("Mỗi lực đều có lực phản tác dụng bằng và ngược chiều.", false),
                            new Option("Điện tích của một hệ thống là bảo toàn.", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Đơn vị đo cường độ dòng điện là gì?",
                    new Option[]{
                            new Option("Ampere", true),
                            new Option("Volt", false),
                            new Option("Watt", false),
                            new Option("Ohm", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Hạt nhân nguyên tử gồm những thành phần nào?",
                    new Option[]{
                            new Option("Proton và neutron", true),
                            new Option("Electron và proton", false),
                            new Option("Neutron và electron", false),
                            new Option("Electron, proton và neutron", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Đơn vị đo năng lượng là gì?",
                    new Option[]{
                            new Option("Joule", true),
                            new Option("Newton", false),
                            new Option("Watt", false),
                            new Option("Pascal", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Điều gì xảy ra khi một vật rơi tự do trong chân không?",
                    new Option[]{
                            new Option("Nó sẽ rơi với gia tốc không đổi.", true),
                            new Option("Nó sẽ rơi với vận tốc không đổi.", false),
                            new Option("Nó sẽ dừng lại.", false),
                            new Option("Nó sẽ rơi với gia tốc giảm dần.", false),
                    },
                    QuestionCategory.PHYSICS
            ),
            new Question(
                    "Thủ đô của Việt Nam là gì?",
                    new Option[]{
                            new Option("Hà Nội", true),
                            new Option("TP Hồ Chí Minh", false),
                            new Option("Đà Nẵng", false),
                            new Option("Nha Trang", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Núi cao nhất thế giới là gì?",
                    new Option[]{
                            new Option("Núi Everest", true),
                            new Option("Núi K2", false),
                            new Option("Núi Kangchenjunga", false),
                            new Option("Núi Lhotse", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Dòng sông dài nhất thế giới là gì?",
                    new Option[]{
                            new Option("Sông Nile", true),
                            new Option("Sông Amazon", false),
                            new Option("Sông Yangtze", false),
                            new Option("Sông Mississippi", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Thành phố đông dân nhất thế giới là gì?",
                    new Option[]{
                            new Option("Tokyo", true),
                            new Option("New York", false),
                            new Option("Mumbai", false),
                            new Option("Mexico City", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Quốc gia lớn nhất về diện tích là gì?",
                    new Option[]{
                            new Option("Nga", true),
                            new Option("Canada", false),
                            new Option("Trung Quốc", false),
                            new Option("Hoa Kỳ", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Đảo lớn nhất thế giới là gì?",
                    new Option[]{
                            new Option("Greenland", true),
                            new Option("New Guinea", false),
                            new Option("Borneo", false),
                            new Option("Madagascar", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Hồ nước ngọt lớn nhất thế giới theo diện tích là gì?",
                    new Option[]{
                            new Option("Hồ Superior", true),
                            new Option("Hồ Victoria", false),
                            new Option("Hồ Huron", false),
                            new Option("Hồ Michigan", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Thác nước cao nhất thế giới là gì?",
                    new Option[]{
                            new Option("Thác Angel", true),
                            new Option("Thác Tugela", false),
                            new Option("Thác Niagara", false),
                            new Option("Thác Victoria", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Sa mạc lớn nhất thế giới là gì?",
                    new Option[]{
                            new Option("Sa mạc Sahara", true),
                            new Option("Sa mạc Gobi", false),
                            new Option("Sa mạc Kalahari", false),
                            new Option("Sa mạc Thar", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Biển lớn nhất thế giới là gì?",
                    new Option[]{
                            new Option("Biển Philippines", true),
                            new Option("Biển Coral", false),
                            new Option("Biển Arabian", false),
                            new Option("Biển Okhotsk", false),
                    },
                    QuestionCategory.GEOLOGY
            ),
            new Question(
                    "Nguyên tử nào có số hiệu nguyên tử là 1?",
                    new Option[]{
                            new Option("Hydrogen", true),
                            new Option("Helium", false),
                            new Option("Lithium", false),
                            new Option("Beryllium", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Công thức hóa học của nước là gì?",
                    new Option[]{
                            new Option("H2O", true),
                            new Option("H2O2", false),
                            new Option("HO2", false),
                            new Option("H3O", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào có ký hiệu là O?",
                    new Option[]{
                            new Option("Oxygen", true),
                            new Option("Osmium", false),
                            new Option("Gold", false),
                            new Option("Silver", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Số Avogadro là gì?",
                    new Option[]{
                            new Option("6.022 x 10^23", true),
                            new Option("3.141 x 10^23", false),
                            new Option("1.602 x 10^-19", false),
                            new Option("9.81 x 10^2", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tử nào có số hiệu nguyên tử là 6?",
                    new Option[]{
                            new Option("Carbon", true),
                            new Option("Nitrogen", false),
                            new Option("Oxygen", false),
                            new Option("Fluorine", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Công thức hóa học của muối ăn là gì?",
                    new Option[]{
                            new Option("NaCl", true),
                            new Option("KCl", false),
                            new Option("NaOH", false),
                            new Option("CaCl2", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Phản ứng nào tạo ra muối và nước?",
                    new Option[]{
                            new Option("Phản ứng trung hòa", true),
                            new Option("Phản ứng oxi hóa khử", false),
                            new Option("Phản ứng cộng", false),
                            new Option("Phản ứng phân hủy", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào là kim loại lỏng ở nhiệt độ phòng?",
                    new Option[]{
                            new Option("Thủy ngân (Mercury)", true),
                            new Option("Bạc (Silver)", false),
                            new Option("Vàng (Gold)", false),
                            new Option("Đồng (Copper)", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Điện tích của một proton là gì?",
                    new Option[]{
                            new Option("Dương 1 (1+)", true),
                            new Option("Âm 1 (1-)", false),
                            new Option("Trung hòa (0)", false),
                            new Option("Âm 2 (2-)", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào là nền tảng của hóa học hữu cơ?",
                    new Option[]{
                            new Option("Carbon", true),
                            new Option("Oxygen", false),
                            new Option("Hydrogen", false),
                            new Option("Nitrogen", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Công thức hóa học của axit sulfuric là gì?",
                    new Option[]{
                            new Option("H2SO4", true),
                            new Option("HCl", false),
                            new Option("HNO3", false),
                            new Option("H2CO3", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào có ký hiệu là Fe?",
                    new Option[]{
                            new Option("Sắt (Iron)", true),
                            new Option("Đồng (Copper)", false),
                            new Option("Bạc (Silver)", false),
                            new Option("Vàng (Gold)", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Phản ứng hóa học nào tạo ra khí CO2 và nước khi đốt cháy hydrocarbon?",
                    new Option[]{
                            new Option("Phản ứng cháy", true),
                            new Option("Phản ứng thế", false),
                            new Option("Phản ứng cộng", false),
                            new Option("Phản ứng trung hòa", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào có số hiệu nguyên tử là 8?",
                    new Option[]{
                            new Option("Oxygen", true),
                            new Option("Nitrogen", false),
                            new Option("Carbon", false),
                            new Option("Fluorine", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Phản ứng hóa học nào liên quan đến sự mất electron?",
                    new Option[]{
                            new Option("Phản ứng oxi hóa", true),
                            new Option("Phản ứng khử", false),
                            new Option("Phản ứng trung hòa", false),
                            new Option("Phản ứng cộng", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Hỗn hợp đồng nhất của hai hoặc nhiều chất được gọi là gì?",
                    new Option[]{
                            new Option("Dung dịch", true),
                            new Option("Hỗn hợp", false),
                            new Option("Hợp chất", false),
                            new Option("Nguyên tử", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Công thức hóa học của methane là gì?",
                    new Option[]{
                            new Option("CH4", true),
                            new Option("C2H6", false),
                            new Option("C3H8", false),
                            new Option("CH3OH", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Phản ứng hóa học nào xảy ra khi axit phản ứng với bazơ?",
                    new Option[]{
                            new Option("Phản ứng trung hòa", true),
                            new Option("Phản ứng oxi hóa khử", false),
                            new Option("Phản ứng phân hủy", false),
                            new Option("Phản ứng cộng", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào có ký hiệu là Na?",
                    new Option[]{
                            new Option("Natri (Sodium)", true),
                            new Option("Niken (Nickel)", false),
                            new Option("Neon", false),
                            new Option("Niobium", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Nguyên tố nào là phi kim có nhiều nhất trong vỏ Trái Đất?",
                    new Option[]{
                            new Option("Oxygen", true),
                            new Option("Silicon", false),
                            new Option("Aluminum", false),
                            new Option("Iron", false),
                    },
                    QuestionCategory.CHEMISTRY
            ),
            new Question(
                    "Hành tinh nào gần Mặt Trời nhất?",
                    new Option[]{
                            new Option("Sao Thủy (Mercury)", true),
                            new Option("Sao Kim (Venus)", false),
                            new Option("Trái Đất (Earth)", false),
                            new Option("Sao Hỏa (Mars)", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Ai là người đưa ra thuyết tiến hóa bằng chọn lọc tự nhiên?",
                    new Option[]{
                            new Option("Charles Darwin", true),
                            new Option("Isaac Newton", false),
                            new Option("Albert Einstein", false),
                            new Option("Galileo Galilei", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Phần nào của tế bào chứa thông tin di truyền?",
                    new Option[]{
                            new Option("Nhân tế bào", true),
                            new Option("Màng tế bào", false),
                            new Option("Tế bào chất", false),
                            new Option("Ti thể", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Ánh sáng là gì?",
                    new Option[]{
                            new Option("Dạng năng lượng điện từ", true),
                            new Option("Dạng năng lượng cơ học", false),
                            new Option("Dạng năng lượng nhiệt", false),
                            new Option("Dạng năng lượng hạt nhân", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Lực hấp dẫn được phát hiện bởi ai?",
                    new Option[]{
                            new Option("Isaac Newton", true),
                            new Option("Albert Einstein", false),
                            new Option("Galileo Galilei", false),
                            new Option("Niels Bohr", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Nguyên tố nào là nền tảng của sự sống trên Trái Đất?",
                    new Option[]{
                            new Option("Carbon", true),
                            new Option("Oxygen", false),
                            new Option("Hydrogen", false),
                            new Option("Nitrogen", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Ai là người đưa ra thuyết tương đối?",
                    new Option[]{
                            new Option("Albert Einstein", true),
                            new Option("Isaac Newton", false),
                            new Option("Niels Bohr", false),
                            new Option("Galileo Galilei", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Hành tinh nào có hệ thống vành đai nổi tiếng?",
                    new Option[]{
                            new Option("Sao Thổ (Saturn)", true),
                            new Option("Sao Mộc (Jupiter)", false),
                            new Option("Sao Thiên Vương (Uranus)", false),
                            new Option("Sao Hải Vương (Neptune)", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Nguyên tố hóa học nào có ký hiệu là O?",
                    new Option[]{
                            new Option("Oxygen", true),
                            new Option("Osmium", false),
                            new Option("Gold", false),
                            new Option("Silver", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Đơn vị đo năng lượng trong hệ SI là gì?",
                    new Option[]{
                            new Option("Joule", true),
                            new Option("Watt", false),
                            new Option("Newton", false),
                            new Option("Pascal", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Phản ứng nào trong tự nhiên chuyển đổi năng lượng mặt trời thành năng lượng hóa học?",
                    new Option[]{
                            new Option("Quang hợp", true),
                            new Option("Hô hấp tế bào", false),
                            new Option("Lên men", false),
                            new Option("Hấp thụ", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Nguyên tố nào có số hiệu nguyên tử là 1?",
                    new Option[]{
                            new Option("Hydrogen", true),
                            new Option("Helium", false),
                            new Option("Lithium", false),
                            new Option("Beryllium", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Ai là người phát hiện ra định luật vạn vật hấp dẫn?",
                    new Option[]{
                            new Option("Isaac Newton", true),
                            new Option("Albert Einstein", false),
                            new Option("Galileo Galilei", false),
                            new Option("Nikola Tesla", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Năng lượng của một photon được tính bằng công thức nào?",
                    new Option[]{
                            new Option("E = hf", true),
                            new Option("E = mc²", false),
                            new Option("E = mv²/2", false),
                            new Option("E = Fd", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Đơn vị đo áp suất là gì?",
                    new Option[]{
                            new Option("Pascal", true),
                            new Option("Newton", false),
                            new Option("Joule", false),
                            new Option("Watt", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Động vật nào là loài có vú duy nhất có khả năng bay?",
                    new Option[]{
                            new Option("Dơi", true),
                            new Option("Chim cánh cụt", false),
                            new Option("Chuột túi", false),
                            new Option("Chim hải âu", false),
                    },
                    QuestionCategory.SCIENCE
            ),
            new Question(
                    "Quá trình nào chuyển đổi năng lượng hóa học thành năng lượng nhiệt trong các tế bào sống?",
                    new Option[]{
                            new Option("Hô hấp tế bào", true),
                            new Option("Quang hợp", false),
                            new Option("Lên men", false),
                            new Option("Hấp thụ", false),
                    },
                    QuestionCategory.SCIENCE
            ),
    };
}
