import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditFoodViewComponent } from './edit-food-view.component';

describe('EditFoodViewComponent', () => {
  let component: EditFoodViewComponent;
  let fixture: ComponentFixture<EditFoodViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditFoodViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditFoodViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
