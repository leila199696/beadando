import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DelDataViewComponent } from './del-data-view.component';

describe('DelDataViewComponent', () => {
  let component: DelDataViewComponent;
  let fixture: ComponentFixture<DelDataViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DelDataViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DelDataViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
